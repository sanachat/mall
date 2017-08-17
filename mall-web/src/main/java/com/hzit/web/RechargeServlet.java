package com.hzit.web;

import com.hzit.dao.BalanceDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Balance;
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
 * Created by acer on 2017/8/15.
 */
@WebServlet(name = "RechargeServlet", value = "/recharge")
public class RechargeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        SqlSession session = SqlSessionHelper.getSqlSession();
        BalanceDao dao = session.getMapper(BalanceDao.class);
        UserInfo userInfo = (UserInfo) request.getSession().getAttribute("user");
        Balance balance = new Balance();
        balance.setUserId(userInfo.getUserId());
        balance = dao.findBalanceByUserid(balance);
        String password = request.getParameter("password");
        String money = request.getParameter("money");
        balance.setMoney(Integer.parseInt(money));
        PrintWriter out = response.getWriter();
        if (password == null || password.length() <= 0) {
            out.print("密码不能为空！");
        } else if (password.equals(balance.getPayPwd()) == false) {
            out.print("密码输入错误！");

        } else if (balance.getMoney() <= 0) {
            out.print("您的金额输入不合法");
        } else {
            dao.addMoney(balance);
            session.commit();
            out.print("充值成功！");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
