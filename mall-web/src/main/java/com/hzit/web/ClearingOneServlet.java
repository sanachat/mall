package com.hzit.web;

import com.hzit.dao.BalanceDao;
import com.hzit.dao.OrderDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Balance;
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

/**
 * Created by acer on 2017/8/16.
 */
@WebServlet(name = "ClearingServlet", value = "/clearingOne")
public class ClearingOneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        SqlSession session = SqlSessionHelper.getSqlSession();
        BalanceDao balanceDao = session.getMapper(BalanceDao.class);
        OrderDao orderDao = session.getMapper(OrderDao.class);
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("user");
        Order order = (Order) request.getSession().getAttribute("order");
        String pwd = request.getParameter("password");
        Balance balance = new Balance();
        balance.setUserId(userInfo.getUserId());
        balance = balanceDao.findBalanceByUserid(balance);
        PrintWriter out = response.getWriter();
        if (pwd.equals(balance.getPayPwd()) == false) {
            out.print("支付密码输入错误！");
        } else if (balance.getMoney() >= order.getPrice()) {
            balance.setMoney(order.getPrice());
            balanceDao.subMoney(balance);
            session.commit();
        } else {
            out.print("余额不足");
            orderDao.delete(userInfo.getUserId());
            session.commit();
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
