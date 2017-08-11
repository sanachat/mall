package com.hzit.web;

import com.hzit.dao.AnnouncementDao;
import com.hzit.dao.ComplainInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Announcement;
import com.hzit.entity.ComplainInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by THINK on 2017/8/11.
 */
@WebServlet(name = "ComplainFindAllServlet",urlPatterns = "/findAllComplain")
public class ComplainFindAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        ComplainInfoDao dao=SqlSessionHelper.getSqlSession().getMapper(ComplainInfoDao.class);
        List<ComplainInfo> complainInfoList=dao.findAll();
        request.setAttribute("complain",complainInfoList);
        request.getRequestDispatcher("ComplainFindAll.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
