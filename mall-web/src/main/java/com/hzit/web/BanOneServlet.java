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
@WebServlet(name = "BanOneServlet",urlPatterns = "/BanOne")
public class BanOneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        SqlSession session=SqlSessionHelper.getSqlSession();
        ShoppingCartDao dao=session.getMapper(ShoppingCartDao.class);
        //获取金额，userId，gamegoodId
        //int uid=Integer.parseInt(request.getParameter("userId"));
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        int uid=userInfo.getUserId();
        int gid=Integer.parseInt(request.getParameter("goodId"));
        int money=dao.banlanceBygameGoodId(uid,gid);
        request.setAttribute("money",money);
        request.setAttribute("uid",uid);
        request.setAttribute("goodid",gid);
        //点击结算后清空购物车
        int sId=Integer.parseInt(request.getParameter("sid"));
        int num=0;
        num=dao.deleteshoppingcart(sId);
        if (num==1){
            session.commit();
        }else {
            response.getWriter().append("删除失败！");
        }
        request.getRequestDispatcher("/CartOrderinsert").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
