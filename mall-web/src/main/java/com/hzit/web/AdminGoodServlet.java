package com.hzit.web;

import com.hzit.dao.GameGoodInfoDao;
import com.hzit.dao.GameInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.GamegoodInfo;

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
@WebServlet(name = "AdminGoodServlet",value="/admingood")
public class AdminGoodServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GameGoodInfoDao dao = SqlSessionHelper.getSqlSession().getMapper(GameGoodInfoDao.class);
        List<GamegoodInfo> allGood=dao.findAllGood();
        request.setAttribute("allgood",allGood);
        request.getRequestDispatcher("admingood.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
