package com.hzit.web;

import com.hzit.dao.SqlSessionHelper;
import com.hzit.dao.UserInfoDao;
import com.hzit.entity.UserInfo;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by THINK on 2017/8/10.
 */
@WebServlet(name = "LoginServlet",value = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        SqlSession session= SqlSessionHelper.getSqlSession();
        UserInfoDao dao=session.getMapper(UserInfoDao.class);
        String name=request.getParameter("loginName");
        String pwd=request.getParameter("loginPwd");
        UserInfo user=new UserInfo();
        user.setLoginName(name);
        user.setLoginPwd(pwd);
        UserInfo userInfo=dao.checkLogin(user);
        String n=userInfo.getUserName();
        if(userInfo==null){
            response.sendRedirect("register.html");
        }else{
            request.getSession().setAttribute("user",userInfo);
            request.getSession().setAttribute("username",n);
            response.sendRedirect("buy.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
