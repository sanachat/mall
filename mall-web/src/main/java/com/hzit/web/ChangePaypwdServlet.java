package com.hzit.web;

import com.hzit.dao.BalanceDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Balance;
import com.hzit.entity.UserInfo;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by acer on 2017/8/12.
 */
@WebServlet(name = "ChangePaypwdServle", value = "/changePayPwd")
public class ChangePaypwdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        SqlSession session = SqlSessionHelper.getSqlSession();
        BalanceDao dao = session.getMapper(BalanceDao.class);
        Balance balance = (Balance) request.getSession().getAttribute("balance");
        String oldpwd = request.getParameter("oldpassword");
        String newpwd1 = request.getParameter("newpassword1");
        String newpwd2 = request.getParameter("newpassword2");
        PrintWriter out = response.getWriter();
        if (oldpwd.equals(balance.getPayPwd()) == false) {
            out.print("原密码输入错误！");

        } else if (newpwd1.equals(newpwd2) == false) {
            out.print("两次密码输入不相同！");
        } else {
            balance.setPayPwd(newpwd1);
            dao.updatePwd(balance);
            session.commit();
            out.print("修改成功！");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
