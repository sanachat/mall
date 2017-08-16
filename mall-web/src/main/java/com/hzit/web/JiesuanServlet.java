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
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("user");
        int i = userInfo.getUserId();

        String p = request.getParameter("price");
        Order order = new Order();
        order.setUserId(i);
        order.setDate("2017-08-15");
        order.setPrice(Double.parseDouble(p));
        int num = or.insert(order);
        session.commit();
        OrderDetail orderdetail = new OrderDetail();
        String g = request.getParameter("gameGoodId");
        orderdetail.setPrices(Double.parseDouble(p));
        orderdetail.setOrderId(order.getOrderId());
        orderdetail.setGamegoodId(Integer.parseInt(g));
        orderdetail.setPrices(Double.parseDouble(p));
        orderdetail.setCount(1);
        orderdetail.setSummoney(orderdetail.getPrices());
        detail.insert(orderdetail);
        session.commit();

        request.getSession().setAttribute("orderAll", orderdetail);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
