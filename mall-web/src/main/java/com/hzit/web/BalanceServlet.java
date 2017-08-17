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

/**
 * Created by acer on 2017/8/11.
 */
@WebServlet(name = "BalanceServlet",value = "/balance")
public class BalanceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        SqlSession session=SqlSessionHelper.getSqlSession();
        BalanceDao dao = session.getMapper(BalanceDao.class);
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        Balance balance=new Balance();
        balance.setUserId(userInfo.getUserId());
        if(dao.findBalanceByUserid(balance)==null){
            balance.setPayPwd("123");
            dao.insert(balance);
            session.commit();
        }
        Balance b=dao.findBalanceByUserid(balance);
        request.getSession().setAttribute("balance", b);
        request.getRequestDispatcher("balance.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
