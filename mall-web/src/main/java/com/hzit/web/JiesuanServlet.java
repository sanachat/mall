package com.hzit.web;

import com.hzit.dao.OrderDao;
import com.hzit.dao.OrderDetailDao;
import com.hzit.dao.SqlSessionHelper;

import com.hzit.entity.Order;
import com.hzit.entity.OrderDetail;
import com.hzit.entity.UserInfo;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by FKL on 2017/8/15.
 */
@WebServlet(name = "JiesuanServlet", value = "/jiesuan")
public class JiesuanServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        SqlSession session = SqlSessionHelper.getSqlSession();
        OrderDao or = session.getMapper(OrderDao.class);
        OrderDetailDao detail = session.getMapper(OrderDetailDao.class);
        OrderDao dao=session.getMapper(OrderDao.class);
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("user");
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=format.format(date);
        int i = userInfo.getUserId();

        String p = request.getParameter("price");
        Order order=new Order();

        order.setUserId(i);
        order.setDate(time);
        order.setPrice(Double.parseDouble(p));
        int num = or.insert(order);
        session.commit();
        Order ord=new Order();
        ord=dao.selectBytime(time);
        int id=ord.getOrderId();
        OrderDetail orderdetail = new OrderDetail();
        String g = request.getParameter("gameGoodId");
        orderdetail.setPrices(Double.parseDouble(p));
        orderdetail.setOrderId(id);
        orderdetail.setGamegoodId(Integer.parseInt(g));
        orderdetail.setPrices(Double.parseDouble(p));
        orderdetail.setCount(1);
        orderdetail.setSummoney(orderdetail.getPrices());
        detail.insert(orderdetail);
        session.commit();

        request.getSession().setAttribute("orderAll", order);
        if(num==1){
            response.sendRedirect("clearingAll.jsp");
        }
        else{
            response.sendRedirect("GameIndex.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
