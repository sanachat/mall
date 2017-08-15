package com.hzit.web;

import com.hzit.dao.ShoppingCartDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.GamegoodInfo;
import com.hzit.entity.ShoppingCart;
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
@WebServlet(name = "AddcartServlet",urlPatterns = "/Addcart")
public class AddcartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SqlSession session= SqlSessionHelper.getSqlSession();
        ShoppingCartDao dao= session.getMapper(ShoppingCartDao.class);
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        int uid=userInfo.getUserId();
        double price=Double.parseDouble(request.getParameter("price"));
        int gid=Integer.parseInt(request.getParameter("gameGoodId"));
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.setUserId(uid);
        shoppingCart.setGameGoodId(gid);
        shoppingCart.setPrice(price);
        shoppingCart.setNum(1);
        int num=dao.insertshoppingcart(shoppingCart);
        if (num==1){
            session.commit();
            response.sendRedirect("/findAllcart");
        }else {
            System.out.println("加入购物车失败！");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doPost(request,response);
    }
}
