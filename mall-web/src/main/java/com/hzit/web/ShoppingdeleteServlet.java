package com.hzit.web;

import com.hzit.dao.ShoppingCartDao;
import com.hzit.dao.SqlSessionHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by THINK on 2017/8/12.
 */
@WebServlet(name = "ShoppingdeleteServlet",urlPatterns = "/shoppingdelete.action" )
public class ShoppingdeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        ShoppingCartDao dao= SqlSessionHelper.getSqlSession().getMapper(ShoppingCartDao.class);
        int Id=Integer.parseInt(request.getParameter("pid"));
        int num=0;
        num=dao.deleteshoppingcart(Id);
        if (num==1){
            response.sendRedirect("findAllcart");
        }else {
            response.getWriter().append("删除失败！");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
