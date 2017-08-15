package com.hzit.web;

import com.hzit.dao.ShoppingCartDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by THINK on 2017/8/14.
 */
@WebServlet(name = "BanAllMoneyServlet",urlPatterns = "/BanAll")
public class BanAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        ShoppingCartDao dao= SqlSessionHelper.getSqlSession().getMapper(ShoppingCartDao.class);
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        int num=userInfo.getUserId();
        int money=dao.allmoney(num);
        request.setAttribute("allmoney",money);
        request.setAttribute("userId",num);
        request.getRequestDispatcher("").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
