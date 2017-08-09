import com.hzit.dao.SqlSessionHelper;
import com.hzit.dao.UserInfoDao;
import com.hzit.entity.UserInfo;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年08月09日 - 13:53
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class TestUserinfo {
    public static void main(String[] args) {
        SqlSession session= SqlSessionHelper.getSqlSession();
        UserInfoDao dao=session.getMapper(UserInfoDao.class);
        UserInfo userinfo=new UserInfo();
        userinfo.setLoginName("LiSi");
        userinfo.setLoginPwd("1234");
        userinfo=dao.checkLogin(userinfo);
        System.out.println(userinfo);
        /*List<UserInfo> userInfo=dao.findAll();
        System.out.println(userInfo);*/
    }
}
