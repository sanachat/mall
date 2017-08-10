package com.hzit.web;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.dao.UserInfoDao;
import com.hzit.entity.UserInfo;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/8/9.
 */
@WebServlet(name = "AdminShowServlet",value="/adminshow")
public class AdminShowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserInfoDao dao= SqlSessionHelper.getSqlSession().getMapper(UserInfoDao.class);
        List<UserInfo> alluser = dao.findAll();
        request.setAttribute("alluser",alluser);
        request.getRequestDispatcher("admin.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
