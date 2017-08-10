package com.hzit.web;

import com.hzit.dao.OrderDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
/**
 * Created by Administrator on 2017/8/10.
 */
@WebServlet(name = "AdminRecordServlet",value="/adminrecord")
public class AdminRecordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OrderDao dao= SqlSessionHelper.getSqlSession().getMapper(OrderDao.class);
        List<Order> allrecord=dao.selectall();
        request.setAttribute("allrecord",allrecord);
        request.getRequestDispatcher("adminrecord.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
