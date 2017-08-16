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
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by wan on 2017/8/12.
 */
@WebServlet(name = "GameDetailServlet",value = "/gamedetail")
public class GameDetailServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        PrintWriter ou = response.getWriter();
        SqlSession session= SqlSessionHelper.getSqlSession();
        GameGoodInfoDao dao=session.getMapper(GameGoodInfoDao.class);
        String de=request.getParameter("oid");
        GamegoodInfo gd=dao.findOneGood(Integer.parseInt(de));
        request.setAttribute("gd",gd);
        request.getRequestDispatcher("GameDetail.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
