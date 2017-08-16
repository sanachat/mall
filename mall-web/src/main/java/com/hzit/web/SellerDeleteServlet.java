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
 * Created by Tracy McGrady on 2017/8/12.
 */
@WebServlet(name = "SellerDeleteServlet",value = "/SellerDelete")
public class SellerDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SqlSession session = SqlSessionHelper.getSqlSession();
        GameGoodInfoDao dao =session.getMapper(GameGoodInfoDao.class);
        int id =Integer.parseInt(request.getParameter("id"));
        int num = dao.deleteGood(id);
        if(num==1)
        {
            session.commit();
            request.getRequestDispatcher("/SellerManage").forward(request,response);
        }else {
            session.rollback();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }
}
