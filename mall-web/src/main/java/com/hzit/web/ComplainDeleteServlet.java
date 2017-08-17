package com.hzit.web;

import com.hzit.dao.AnnouncementDao;
import com.hzit.dao.ComplainInfoDao;
import com.hzit.dao.SqlSessionHelper;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by THINK on 2017/8/12.
 */
@WebServlet(name = "ComplainDeleteServlet",urlPatterns = "/dodeleteComplain.action")
public class ComplainDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        String complainId=request.getParameter("pid");
        SqlSession session= SqlSessionHelper.getSqlSession();
        ComplainInfoDao dao= session.getMapper(ComplainInfoDao.class);
        int num=dao.deleteComplain(Integer.parseInt(complainId));
        session.commit();
        if(num==1){
            response.sendRedirect("/findAllComplain");
        }else{
            session.rollback();
            response.sendRedirect("/findAllComplain");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
