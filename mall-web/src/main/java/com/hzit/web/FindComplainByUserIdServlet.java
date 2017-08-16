package com.hzit.web;

import com.hzit.dao.ComplainInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.ComplainInfo;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by THINK on 2017/8/14.
 */
@WebServlet(name = "FindComplainByUserIdServlet",urlPatterns = "/findComplainByUserId")
public class FindComplainByUserIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String userID=request.getParameter("userId");
        ComplainInfoDao dao=SqlSessionHelper.getSqlSession().getMapper(ComplainInfoDao.class);
        List<ComplainInfo> c=dao.findComplainByUserId(Integer.parseInt(userID));
        request.setAttribute("complainbyuserid",c);
        request.getRequestDispatcher("FindComplainByUserId.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
