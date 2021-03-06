package com.hzit.web;

import com.hzit.dao.OrderDao;
import com.hzit.dao.OrderDetailDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Order;
import com.hzit.entity.OrderDetail;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by THINK on 2017/8/16.
 */
@WebServlet(name = "CartOrderinsertServlet",urlPatterns = "/CartOrderinsert")
public class CartOrderinsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        SqlSession session= SqlSessionHelper.getSqlSession();
        OrderDao dao= session.getMapper(OrderDao.class);
        OrderDetailDao detail = session.getMapper(OrderDetailDao.class);
        int userId= (Integer)request.getSession().getAttribute("uid");
        double price= (Double)request.getSession().getAttribute("money");
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=format.format(date);
        Order o=new Order();
        o.setUserId(userId);
        o.setDate(time);
        o.setPrice(price);
        int num=dao.insert(o);
        session.commit();
        Order to=new Order();
        to=dao.selectBytime(time);
        int id=to.getOrderId();
        OrderDetail orderdetail = new OrderDetail();
        int g = (Integer)request.getSession().getAttribute("goodid");
        orderdetail.setOrderId(id);
        orderdetail.setGamegoodId(g);
        orderdetail.setPrices(price);
        orderdetail.setCount(1);
        orderdetail.setSummoney(price);
        detail.insert(orderdetail);
        session.commit();
        request.getSession().setAttribute("order", o);
        response.sendRedirect("clearingOne.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
