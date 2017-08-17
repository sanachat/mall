package com.hzit.web;

import com.hzit.dao.AnnouncementDao;
import com.hzit.dao.ComplainInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Announcement;
import com.hzit.entity.ComplainInfo;
import com.hzit.entity.UserInfo;
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
        //response.setContentType("text/html;charset=utf-8");
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        int id=userInfo.getUserId();
        String content=request.getParameter("content");
        SqlSession session=SqlSessionHelper.getSqlSession();
        ComplainInfoDao dao=session.getMapper(ComplainInfoDao.class);
        ComplainInfo c=new ComplainInfo();
        c.setUserId(id);
        c.setContent(content);
        int num=dao.insertComplain(c);
        if(num==1){
            session.commit();
            //String script = "<script>alert('添加成功')</script>";
            //response.getWriter().print(script);
            request.getRequestDispatcher("/findComplainByUserId").forward(request,response);
        }else{
            session.rollback();
           // String script = "<script>alert('添加失败')</script>";
            //response.getWriter().print(script);
            request.getRequestDispatcher("/addComplain").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
