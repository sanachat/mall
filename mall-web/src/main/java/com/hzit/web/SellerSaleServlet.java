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
@WebServlet(name = "SellerSaleServlet",value = "/SellerSale")
public class SellerSaleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession session = SqlSessionHelper.getSqlSession();
        GameGoodInfoDao dao = session.getMapper(GameGoodInfoDao.class);
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        GamegoodInfo gamegoodInfo = new GamegoodInfo();
        String a=request.getParameter("gamegoodname");
        int b=Integer.parseInt(request.getParameter("gameid"));
        int c=Integer.parseInt(request.getParameter("gameserverid"));
        String d=request.getParameter("rolename");
        int e=Integer.parseInt(request.getParameter("gametypeid"));
        int f=Integer.parseInt(request.getParameter("gamegoodsellcount"));
        int g=Integer.parseInt(request.getParameter("gamegoodcount"));
        String h=request.getParameter("describe");
        String i=request.getParameter("sellername");
        double j =Double.parseDouble(request.getParameter("unitprice"));
        gamegoodInfo.setUnitPrice(j);
        gamegoodInfo.setGameGoodName(a);
        gamegoodInfo.setGameId(b);
        gamegoodInfo.setGameServerId(c);
        gamegoodInfo.setRoleName(d);
        gamegoodInfo.setGameTypeId(e);
        gamegoodInfo.setGameGoodSellCount(f);
        gamegoodInfo.setGameGoodCount(g);
        gamegoodInfo.setDescribe(h);
        gamegoodInfo.setSellerName(i);
        GamegoodInfo game = gamegoodInfo;
        int num = dao.insertGood(game);
        if(num==1) {
            session.commit();
            request.getSession().setAttribute("game", game);
            response.sendRedirect("/SellerManage");
        }
        else
        {
            session.rollback();
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
