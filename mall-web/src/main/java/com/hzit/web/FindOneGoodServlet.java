package com.hzit.web;

import com.hzit.dao.GameGoodInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.GamegoodInfo;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Tracy McGrady on 2017/8/15.
 */
@WebServlet(name = "FindOneGoodServlet",value = "/FindOneGood")
public class FindOneGoodServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession session= SqlSessionHelper.getSqlSession();
        GameGoodInfoDao dao = session.getMapper(GameGoodInfoDao.class);
        int id = Integer.parseInt(request.getParameter("id"));
        GamegoodInfo g =dao.findOneGood(id);
        request.getSession().setAttribute("g",g);
        response.sendRedirect("SellerUpdate.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
