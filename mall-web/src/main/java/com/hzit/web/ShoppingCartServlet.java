package com.hzit.web;

import com.hzit.dao.ShoppingCartDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.ShoppingCart;
import com.hzit.entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by THINK on 2017/8/10.
 */
@WebServlet(name = "ShoppingCartServlet",urlPatterns = "/findAllcart")
public class ShoppingCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        ShoppingCartDao dao= SqlSessionHelper.getSqlSession().getMapper(ShoppingCartDao.class);
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        int user=userInfo.getUserId();
        List<ShoppingCart> list=dao.findshoppingcart(user);
        request.setAttribute("list",list);
        request.getRequestDispatcher("ShoppingCart.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
