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
 * Created by Administrator on 2017/8/10.
 */
@WebServlet(name = "AdminDeleteUserServlet",value="/admindeleteuser")
public class AdminDeleteUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession session = SqlSessionHelper.getSqlSession();
        UserInfoDao dao=session.getMapper(UserInfoDao.class);
        int id=Integer.parseInt(request.getParameter("uid"));
        int num=dao.deleteUser(id);
        if (num==1){
            session.commit();
            request.getRequestDispatcher("/adminshow").forward(request,response);
        }else{
            session.rollback();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
