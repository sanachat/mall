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
import java.util.List;

/**
 * Created by Tracy McGrady on 2017/8/10.
 */
@WebServlet(name = "SellerManageServlet",value = "/SellerManage")
public class SellerManageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession session = SqlSessionHelper.getSqlSession();
        GameGoodInfoDao dao = session.getMapper(GameGoodInfoDao.class);
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        List<GamegoodInfo> list = dao.findAllGood();
        request.getSession().setAttribute("list", list);
        response.sendRedirect("login.html");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
