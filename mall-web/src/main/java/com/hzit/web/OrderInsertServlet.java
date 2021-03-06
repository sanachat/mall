package com.hzit.web;

import com.hzit.dao.OrderDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Order;
import com.hzit.entity.UserInfo;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.DoubleSummaryStatistics;

/**
 * Created by wan on 2017/8/10.
 */
@WebServlet(name = "OrderDeleteServlet",value = "/Orderinsert")
public class OrderInsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        SqlSession session=SqlSessionHelper.getSqlSession();
        OrderDao dao= session.getMapper(OrderDao.class);
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("user");
        int i=userInfo.getUserId();

        //String Id=request.getParameter("orderId");
        //String userId=request.getParameter("userId");
        String date=request.getParameter("date");
        String price=request.getParameter("price");
        Order o=new Order();
        //o.setOrderId(Integer.parseInt(Id));
        o.setUserId(userInfo.getUserId());
        o.setDate(date);
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

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
