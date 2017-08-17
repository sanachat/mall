package com.hzit.web;

import com.hzit.dao.OrderDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Order;
import com.hzit.entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by wan on 2017/8/16.
 */
@WebServlet(name = "MyOrderServlet",value = "/myorder")
public class MyOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        OrderDao dao= SqlSessionHelper.getSqlSession().getMapper(OrderDao.class);
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("user");
        int i=userInfo.getUserId();
        List<Order> od=dao.selectbyuid(i);
        request.setAttribute("od",od);
        request.getRequestDispatcher("MyOrder.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
