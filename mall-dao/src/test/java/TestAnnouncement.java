import com.hzit.dao.AnnouncementDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Announcement;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class TestAnnouncement {
    public static void main(String[] args) {
        SqlSession session= SqlSessionHelper.getSqlSession();
        AnnouncementDao dao=session.getMapper(AnnouncementDao.class);
        int num=0;
        Announcement a=new Announcement();
        //查找所有的公告
       /* List<Announcement> list=new ArrayList<Announcement>();
        list=dao.findAll();
        for(Announcement s:list){
            System.out.println(s);
        }
        session.commit();*/
        //根据公告ID查找公告
        /*a=dao.findAnnouncementById(4);
        session.commit();
        System.out.println(a);*/
        //增加一条公告
       a.setAnnouncementId(4);
        a.setAnnouncementName("《王者荣耀》收费调整公告");
        a.setAnnouncementContent("尊敬的用户：\n" +
                "　　\n" +
                "为了向您提供更优质的服务，从2017年7月10日13:45起，手机游戏《王者荣耀》的装备、皮肤赠送、战队、陪玩交易服务费统一下调至2%！\n" +
                "　　\n" +
                "　我要买       我要卖\n" +
                "　　\n" +
                "真诚感谢您对我们工作一如既往的支持！\n" +
                "中国网络游戏服务网\n" +
                "2017年7月10日");
        num=dao.insertAnnouncement(a);
        session.commit();
        System.out.println("增加成功，受到影响的行数是："+num);
        //删除发布了的公告
        /*num=dao.deleteAnnouncement("3");
        session.commit();
        System.out.println("删除成功,受到影响的行数是："+num);*/
    }
}
