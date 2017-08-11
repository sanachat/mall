package com.hzit.web;

import com.hzit.dao.BalanceDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Balance;
import com.hzit.entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by acer on 2017/8/11.
 */
@WebServlet(name = "BalanceServlet")
public class BalanceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        BalanceDao dao = SqlSessionHelper.getSqlSession().getMapper(BalanceDao.class);
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        Balance balance=dao.findBalanceByUserid(userInfo.getUserId());
        request.setAttribute("balance", balance);
        request.getRequestDispatcher("balance.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
