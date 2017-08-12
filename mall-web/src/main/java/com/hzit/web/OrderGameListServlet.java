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
import java.util.List;

/**
 * Created by wan on 2017/8/10.
 */
@WebServlet(name = "OrderGameListServlet",value = "/OrderGameList")
public class OrderGameListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     /*   response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        SqlSession session=SqlSessionHelper.getSqlSession();
        OrderDao dao= session.getMapper(OrderDao.class);
        String id=request.getParameter("orderId");
        List<Order> l=dao.selectdetail(Integer.parseInt(id));
        request.setAttribute("l",l);
        request.getRequestDispatcher("OrderGameFind.jsp").forward(request,response);*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
