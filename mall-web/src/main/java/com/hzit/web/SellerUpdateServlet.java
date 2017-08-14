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
 * Created by Tracy McGrady on 2017/8/10.
 */
@WebServlet(name = "SellerUpdateServlet",value = "/SellerUpdate")
public class SellerUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession session = SqlSessionHelper.getSqlSession();
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        GameGoodInfoDao dao = session.getMapper(GameGoodInfoDao.class);
        GamegoodInfo gamegoodInfo = new GamegoodInfo();
        int id =Integer.parseInt(request.getParameter("id"));
        int a = Integer.parseInt(request.getParameter("gamegoodsellcount"));
        int b = Integer.parseInt(request.getParameter("gamegoodcount"));
        String c = request.getParameter("describe");
        double d = Double.parseDouble(request.getParameter("unitprice"));
        String e = request.getParameter("pictureUrl");
        gamegoodInfo.setGameGoodId(id);
        gamegoodInfo.setGameGoodSellCount(a);
        gamegoodInfo.setGameGoodCount(b);
        gamegoodInfo.setDescribe(c);
        gamegoodInfo.setUnitPrice(d);
        gamegoodInfo.setPictureUrl(e);
        GamegoodInfo g =gamegoodInfo;
        int  num =dao.updateGood(g);
        if(num==1) {
            session.commit();
            response.sendRedirect("/SellerManage");
        }
        else{
            session.rollback();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
