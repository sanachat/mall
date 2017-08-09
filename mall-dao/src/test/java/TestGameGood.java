import com.hzit.dao.GameGoodInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.GamegoodInfo;

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
        GameGoodInfoDao dao = SqlSessionHelper.getSqlSession().getMapper(GameGoodInfoDao.class);
        List <GamegoodInfo> list = dao.findAllGood();
        for(GamegoodInfo g:list)
        {
            System.out.println(g);
        }
    }
}
