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
import java.io.PrintWriter;
import java.io.Writer;

/**
 * Created by THINK on 2017/8/10.
 */
@WebServlet(name = "LoginServlet",value = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //response.setCharacterEncoding("utf-8");
        SqlSession session= SqlSessionHelper.getSqlSession();
        UserInfoDao dao=session.getMapper(UserInfoDao.class);
        String name=request.getParameter("loginName");
        String pwd=request.getParameter("loginPwd");
        UserInfo user=new UserInfo();
        user.setLoginName(name);
        user.setLoginPwd(pwd);
        UserInfo userInfo=dao.checkLogin(user);
        if(userInfo==null){
            response.sendRedirect("register.html");
        }else{
            int stateid=userInfo.getUserStateId();
            if(stateid==2){
                String script = "<script>alert('您的账号已被冻结，暂无登录权限，请重新注册！');location.href='register.html'</script>";
                response.getWriter().print(script);
            }else {
                request.getSession().setAttribute("user", userInfo);
                String n = userInfo.getUserName();
                request.getSession().setAttribute("username", n);
                int roleid = userInfo.getRoleId();
                if (roleid == 1) {
                    response.sendRedirect("/adminshow");
                } else {
                    response.sendRedirect("buy.jsp");
                }
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
