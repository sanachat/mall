package com.hzit.web;

import com.hzit.dao.GameInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.GameInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/8/9.
 */
@WebServlet(name = "AdminGameServlet")
public class AdminGameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GameInfoDao dao = SqlSessionHelper.getSqlSession().getMapper(GameInfoDao.class);
        List<GameInfo> allgame=dao.findGame();
        request.setAttribute("allgame",allgame);
        request.getRequestDispatcher("admingame.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
