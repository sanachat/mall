package com.hzit.web;

import com.hzit.dao.ShoppingCartDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.dao.UserInfoDao;
import com.hzit.entity.ShoppingCart;
import com.hzit.entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by THINK on 2017/8/16.
 */
@WebServlet(name = "UserShowServlet",value = "/userShow")
public class UserShowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        UserInfoDao dao=SqlSessionHelper.getSqlSession().getMapper(UserInfoDao.class);
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        int id=userInfo.getUserId();
        List<UserInfo> findUserById=dao.findUserById(id);
        request.getSession().setAttribute("find",findUserById);
        //response.sendRedirect("UserShow.jsp");
        request.getRequestDispatcher("UserShow.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
