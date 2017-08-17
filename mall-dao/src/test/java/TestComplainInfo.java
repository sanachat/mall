import com.hzit.dao.ComplainInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.ComplainInfo;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class TestComplainInfo {
    public static void main(String[] args) {
        SqlSession session= SqlSessionHelper.getSqlSession();
        ComplainInfoDao dao=session.getMapper(ComplainInfoDao.class);
        int num=0;
        ComplainInfo c=new ComplainInfo();
        List<ComplainInfo> list=new ArrayList<ComplainInfo>();
        //管理员查看所有用户的投诉
      /*list=dao.findAll();
        for (ComplainInfo s:list){
            System.out.println(s);
        }*/

        //用户根据自己的userid查看自己发布的投诉
        list=dao.findComplainByUserId(1);
        for(ComplainInfo s:list){
            System.out.println(s);
        }

        //用户增加（发布）投诉或者管理员回复（增加）投诉
     /* c.setComplainId(1);
        c.setUserId(1);
        c.setContent("交易出现问题");
        num=dao.insertComplain(c);
        session.commit();
        System.out.println("投诉增加成功，受到影响的行数是："+num);*/

        //用户删除投诉，管理员删除回复的投诉
        /*num=dao.deleteComplain(2);
        session.commit();
        System.out.println("删除成功，受到影响的行数是："+num);*/

    }
}
