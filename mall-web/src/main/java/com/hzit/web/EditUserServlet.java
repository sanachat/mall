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
@WebServlet(name = "EditUserServlet",value = "/edituser")
public class EditUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        SqlSession session= SqlSessionHelper.getSqlSession();
        UserInfoDao dao=session.getMapper(UserInfoDao.class);
        String pwd=request.getParameter("loginPwd");
        String tel=request.getParameter("tel");
        String emil=request.getParameter("email");
        String address=request.getParameter("address");
        String question=request.getParameter("question");
        String answer=request.getParameter("answer");
        UserInfo user=new UserInfo();
        user=(UserInfo)request.getSession().getAttribute("user");
        user.getUserId();
        user.setLoginPwd(pwd);
        user.setTel(tel);
        user.setUserEmail(emil);
        user.setAddress(address);
        user.setPwdQuestion(question);
        user.setPwdAnswer(answer);
        int num=dao.updateUser(user);
        session.commit();
        if(num!=0){
            response.sendRedirect("/userShow");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
