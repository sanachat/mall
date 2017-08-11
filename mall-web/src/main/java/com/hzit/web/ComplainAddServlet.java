package com.hzit.web;

import com.hzit.dao.AnnouncementDao;
import com.hzit.dao.ComplainInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Announcement;
import com.hzit.entity.ComplainInfo;
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
@WebServlet(name = "ComplainAddServlet",urlPatterns = "/addComplain")
public class ComplainAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String complainId=request.getParameter("complainId");
        String userId=request.getParameter("userId");
        String content=request.getParameter("content");

        SqlSession session= SqlSessionHelper.getSqlSession();
        ComplainInfoDao dao= session.getMapper(ComplainInfoDao.class);
        ComplainInfo a=new ComplainInfo();
        a.setComplainId(Integer.parseInt(complainId));
        a.setUserId(Integer.parseInt(userId));
        a.setContent(content);
        int num=dao.insertComplain(a);
        if(num==1){
            session.commit();
            response.sendRedirect("ComplainFindAll.jsp");
        }else{
            session.rollback();
            System.out.println("ComplainFindAll.jsp");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
