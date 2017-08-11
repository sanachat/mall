package com.hzit.web;

import com.hzit.dao.AnnouncementDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Announcement;
import org.apache.ibatis.session.SqlSession;

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
@WebServlet(name = "AnnouncementServlet",urlPatterns = "/findAllAnnouncement")
public class AnnouncementServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        AnnouncementDao dao= SqlSessionHelper.getSqlSession().getMapper(AnnouncementDao.class);
        List<Announcement> list=dao.findAll();
        request.setAttribute("li",list);
        request.getRequestDispatcher("Announcement.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
