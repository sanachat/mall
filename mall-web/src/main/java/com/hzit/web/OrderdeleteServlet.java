package com.hzit.web;

import com.hzit.dao.OrderDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Order;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by wan on 2017/8/12.
 */
@WebServlet(name = "OrderdeleteServlet",value = "/orderdelete")
public class OrderdeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        PrintWriter ou = response.getWriter();
        SqlSession session=SqlSessionHelper.getSqlSession();
        OrderDao dao= session.getMapper(OrderDao.class);
        String id=request.getParameter("oid");
        int num=dao.delete(Integer.parseInt(id));
        session.commit();
        request.getRequestDispatcher("/OrderList").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
