package com.hzit.web;

import com.hzit.dao.ShoppingCartDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.UserInfo;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by THINK on 2017/8/14.
 */
@WebServlet(name = "BanAllMoneyServlet",urlPatterns = "/BanAll")
public class BanAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        SqlSession session=SqlSessionHelper.getSqlSession();
        ShoppingCartDao dao= session.getMapper(ShoppingCartDao.class);
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        int uid=Integer.parseInt(request.getParameter("uid"));
       /* int money=dao.allmoney(uid);
        request.setAttribute("allmoney",money);
        request.setAttribute("userId",uid);*/
        int num=dao.banAll(uid);
        if (num==1){
            session.commit();
            response.sendRedirect("/findAllcart");
        }else {
            response.getWriter().append("删除失败！");
        }

       // request.getRequestDispatcher("").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
