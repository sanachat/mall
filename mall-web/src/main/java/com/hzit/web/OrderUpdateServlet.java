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

/**
 * Created by wan on 2017/8/10.
 */
@WebServlet(name = "OrderUpdateServlet",value ="/OrderUpdate")
public class OrderUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        SqlSession session= SqlSessionHelper.getSqlSession();
        OrderDao dao= session.getMapper(OrderDao.class);
        String Id=request.getParameter("orderId");
        String userId=request.getParameter("userId");
        String date=request.getParameter("date");
        String price=request.getParameter("price");
        Order o=new Order();
        o.setOrderId(Integer.parseInt(Id));
        o.setUserId(Integer.parseInt(userId));
        o.setDate(date);
        o.setPrice(Double.parseDouble(price));
        int num=dao.update(o);
        session.commit();
        PrintWriter ou = response.getWriter();
        if(num==1){
            System.out.println(num);
            ou.print("修改订单成功");

        }
        else{
            session.rollback();
            System.out.println("修改失败");
            ou.print("修改订单失败");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
