package com.hzit.web;

import com.hzit.dao.SqlSessionHelper;
import com.hzit.dao.UserInfoDao;
import com.hzit.entity.UserInfo;
import org.apache.ibatis.session.SqlSession;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/10.
 */
@WebServlet(name = "AdminInsertServlet",value="/admininsert")
public class AdminInsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        SqlSession session = SqlSessionHelper.getSqlSession();
        UserInfoDao dao=session.getMapper(UserInfoDao.class);
        String name=request.getParameter("loginname");
        String pwd=request.getParameter("loginpwd");
        String rpwd=request.getParameter("rpwd");
        String realname=request.getParameter("realname");
        if(pwd.equals(rpwd)){
        int num=dao.insertAdmin(name,pwd,realname);
        if (num==1){
            session.commit();
            request.getRequestDispatcher("/adminshow").forward(request,response);
        }else{
            session.rollback();
            out.println("添加失败！<a href='admininsert.jsp'>点击返回</a>");
        }
        } else {
            out.println("两次密码不一致！<a href='admininsert.jsp'>点击返回</a>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
