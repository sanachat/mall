package com.hzit.web;

import com.hzit.dao.GameGoodInfoDao;
import com.hzit.dao.SqlSessionHelper;
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
@WebServlet(name = "AdminDeleteGoodServlet",value="/admindeletegood")
public class AdminDeleteGoodServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession session= SqlSessionHelper.getSqlSession();
        GameGoodInfoDao dao=session.getMapper(GameGoodInfoDao.class);
        int goodid=Integer.parseInt(request.getParameter("goodid"));
        int num=dao.deleteGood(goodid);
        if (num==1){
            session.commit();
            request.getRequestDispatcher("/admingood").forward(request,response);
        }else{
            session.rollback();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);

    }
}
