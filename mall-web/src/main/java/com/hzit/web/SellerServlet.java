package com.hzit.web;

import com.hzit.dao.SqlSessionHelper;
import com.hzit.dao.UserInfoDao;
import com.hzit.entity.UserInfo;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Tracy McGrady on 2017/8/9.
 */
@WebServlet(name = "SellerServlet",value = "/Seller")
public class SellerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        SqlSession session = SqlSessionHelper.getSqlSession();
        UserInfoDao dao = session.getMapper(UserInfoDao.class);
        UserInfo userInfo =(UserInfo)request.getSession().getAttribute("user");
        int num = dao.updateSeller(userInfo.getUserId());
        if(num==1) {
            session.commit();
            String script = "<script>alert('修改成功！请重新登录！');location.href='login.html'</script>";
            response.getWriter().print(script);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
