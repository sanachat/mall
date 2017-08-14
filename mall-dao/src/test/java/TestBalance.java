import com.hzit.dao.BalanceDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Balance;
import org.apache.ibatis.session.SqlSession;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年08月09日 - 13:59
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestBalance {
    public static void main(String[] args) {
        SqlSession session=SqlSessionHelper.getSqlSession();
        BalanceDao dao =session.getMapper(BalanceDao.class);
        Balance balance = new Balance();

/*        //增加数据
        balance.setUserId(123);
        balance.setMoney(400);
        balance.setPayPwd("123456");
        int num = dao.insert(balance);
        System.out.println(num + "行受到影响");
        session.commit();*/

    }
}
