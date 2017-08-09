import com.hzit.dao.OrderDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Order;
import org.apache.ibatis.session.SqlSession;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年08月09日 - 11:50
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestOrder {

    public static void main(String[] args) {
        SqlSession session= SqlSessionHelper.getSqlSession();
        OrderDao dao=session.getMapper(OrderDao.class);
        int num=0;
        Order o=new Order();
        o.setOrderId(1);
        o.setUserId(1);
        o.setDate("2017-8-9");
        o.setPrice(500);
        num=dao.insert(o);
        session.commit();
        System.out.println("增加成功，受到影响的行数是："+num);

    }
}
