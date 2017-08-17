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
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        int uid=userInfo.getUserId();
        int gid=Integer.parseInt(request.getParameter("goodId"));
        int sid=Integer.parseInt(request.getParameter("sid"));
        double money=dao.banlanceBygameGoodId(uid,sid);
        request.getSession().setAttribute("money", money);
        request.getSession().setAttribute("uid", uid);
        request.getSession().setAttribute("goodid",gid);
        //点击结算后清空购物车
        int sId=Integer.parseInt(request.getParameter("sid"));
        int num=0;
        num=dao.deleteshoppingcart(sId);
        if (num==1){
            session.commit();
            response.sendRedirect("/CartOrderinsert");
        }else {
            response.getWriter().append("删除失败！");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
