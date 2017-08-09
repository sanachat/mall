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
 * Created by Tracy McGrady on 2017/8/9.
 */
@WebServlet(name = "SellerServlet")
public class SellerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession session = SqlSessionHelper.getSqlSession();
        UserInfoDao dao = session.getMapper(UserInfoDao.class);
        UserInfo userInfo =(UserInfo)request.getSession().getAttribute("");
        dao.updateSeller(userInfo.getUserId());
        session.commit();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
