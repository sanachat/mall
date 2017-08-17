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

/**
 * Created by THINK on 2017/8/9.
 */
@WebServlet(name = "AnnouncementAddServlet",urlPatterns ="/addAnnouncement")
public class AnnouncementAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String announcementId=request.getParameter("announcementId");
        String announcementname=request.getParameter("announcementName");
        String announcementContent=request.getParameter("announcementContent");

        SqlSession session=SqlSessionHelper.getSqlSession();
        AnnouncementDao dao= session.getMapper(AnnouncementDao.class);
        Announcement a=new Announcement();
        a.setAnnouncementId(Integer.parseInt(announcementId));
        a.setAnnouncementName(announcementname);
        a.setAnnouncementContent(announcementContent);
        int num=dao.insertAnnouncement(a);
        if(num==1){
            session.commit();
           response.sendRedirect("/findAllAnnouncement");
        }else{
            session.rollback();
            System.out.println("/findAllAnnouncement");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
