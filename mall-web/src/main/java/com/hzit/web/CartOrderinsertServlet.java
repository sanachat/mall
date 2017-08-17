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
        String userId=(String)request.getSession().getAttribute("uid");
        String price= (String)request.getSession().getAttribute("money");
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=format.format(date);
        Order o=new Order();
        o.setUserId(Integer.parseInt(userId));
        o.setDate(time);
        o.setPrice(Double.parseDouble(price));
        int num=dao.insert(o);
        session.commit();
        PrintWriter ou = response.getWriter();
        if(num==1){
            System.out.println(num);
            ou.print("添加订单成功");
        }
        else{
            session.rollback();
            System.out.println("增加失败");
            ou.print("添加订单失败");
        }
    }
    //
    //
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
