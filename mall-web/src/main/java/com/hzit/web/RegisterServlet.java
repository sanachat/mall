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
 * Created by THINK on 2017/8/9.
 */
@WebServlet(name = "RegisterServlet",value = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        SqlSession session= SqlSessionHelper.getSqlSession();
        UserInfoDao dao=session.getMapper(UserInfoDao.class);
        String name=request.getParameter("loginName");
        String sex=request.getParameter("sex");
        String pwd=request.getParameter("loginPwd");
        String cfpwd=request.getParameter("comfirmPwd");
        String tureName=request.getParameter("userName");
        String tel=request.getParameter("tel");
        String emil=request.getParameter("email");
        String idcard=request.getParameter("idCard");
        String address=request.getParameter("address");
        String storeName=request.getParameter("storeName");
        String question=request.getParameter("question");
        String answer=request.getParameter("answer");
        UserInfo user=new UserInfo();
        user.setLoginName(name);
        user.setUserSex(sex);
        user.setLoginPwd(pwd);
        user.setUserName(tureName);
        user.setTel(tel);
        user.setUserEmail(emil);
        user.setIdCard(idcard);
        user.setAddress(address);
        user.setStoreName(storeName);
        user.setPwdQuestion(question);
        user.setPwdAnswer(answer);
        int num=dao.insertUser(user);
        if(num==1){
            session.commit();
            String script = "<script>alert('注册成功！请登录！');location.href='login.html'</script>";
            response.getWriter().print(script);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
