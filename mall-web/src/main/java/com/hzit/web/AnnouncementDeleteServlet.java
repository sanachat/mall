package com.hzit.web;

import com.hzit.dao.AnnouncementDao;
import com.hzit.dao.SqlSessionHelper;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by THINK on 2017/8/11.
 */
@WebServlet(name = "AnnouncementDeleteServlet",urlPatterns = "/dodeleteAnnouncement.action")
public class AnnouncementDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        String announcementid=request.getParameter("pid");
        SqlSession session=SqlSessionHelper.getSqlSession();
        AnnouncementDao dao= session.getMapper(AnnouncementDao.class);
        int num=dao.deleteAnnouncement(announcementid);
        session.commit();
        if(num==1){
            response.sendRedirect("/findAllAnnouncement");
        }else{
            session.rollback();
            response.sendRedirect("/findAllAnnouncement");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
