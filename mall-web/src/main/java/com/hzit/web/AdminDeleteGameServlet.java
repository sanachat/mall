package com.hzit.web;

import com.hzit.dao.GameInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.GameInfo;
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
@WebServlet(name = "AdminDeleteGameServlet",value="/admindeletegame")
public class AdminDeleteGameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession session = SqlSessionHelper.getSqlSession();
        GameInfoDao dao =session.getMapper(GameInfoDao.class);
        int id=Integer.parseInt(request.getParameter("gameid"));
        int num=dao.deleteGame(id);
        if (num==1){
            session.commit();
            request.getRequestDispatcher("/admingame").forward(request,response);
        }else{
            session.rollback();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
