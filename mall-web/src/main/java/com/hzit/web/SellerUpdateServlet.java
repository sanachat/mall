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
        GamegoodInfo g =(GamegoodInfo)request.getSession().getAttribute("g");
        String a = request.getParameter("gamegoodsellcount");
        String b = request.getParameter("gamegoodcount");
        String c = request.getParameter("describe");
        String d = request.getParameter("unitprice");
        String e = request.getParameter("pictureUrl");
        if(a.length()!=0)
        {
            g.setGameGoodSellCount(Integer.parseInt(a));
        }
        if(b.length()!=0)
        {
            g.setGameGoodCount(Integer.parseInt(b));
        }
        if(c.length()!=0)
        {
            g.setDescribe(c);
        }
        if(d.length()!=0)
        {
            g.setUnitPrice(Double.parseDouble(d));
        }
        if(e.length()!=0)
        {
            g.setPictureUrl(e);
        }
        int  num =dao.updateGood(g);
        if(num==1) {
            session.commit();
            request.getSession().setAttribute("g",g);
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
