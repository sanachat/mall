import com.hzit.dao.GameGoodInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.GamegoodInfo;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月09日 - 13:37
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestGameGood
{
    public static void main(String[] args) {
        SqlSession session = SqlSessionHelper.getSqlSession();
        GameGoodInfoDao dao =session.getMapper(GameGoodInfoDao.class);
        /*GamegoodInfo g = new GamegoodInfo();
        g.setGameGoodCount(100);
        g.setGameGoodName("铭文");
        g.setGameGoodSellCount(0);
        g.setGameServerId(1);
        g.setGameId(6);
        g.setRoleName(null);
        g.setGameTypeId(1);
        g.setDescribe(null);
        g.setSellerName("王者商店");
        g.setUnitPrice(10);
        int num = dao.insertGood(g);
        System.out.println(num);
         session.commit();*/
//        int num = dao.deleteGood(5);
//        System.out.println(num);
//        session.commit();
        List<GamegoodInfo> list =dao.findAllGood();
        for(GamegoodInfo a :list)
            System.out.println(a);



    }
}
