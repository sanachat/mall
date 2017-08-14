import com.hzit.dao.OrderDao;
import com.hzit.dao.OrderDetailDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Order;
import com.hzit.entity.OrderDetail;
import org.apache.ibatis.session.SqlSession;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年08月14日 - 14:57
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestOrderDetail {
    public static void main(String[] args) {
        SqlSession session= SqlSessionHelper.getSqlSession();
        OrderDetailDao dao=session.getMapper(OrderDetailDao.class);
        OrderDao d=session.getMapper(OrderDao.class);
        int num=0;
        OrderDetail o=new OrderDetail();
        Order or=new Order();
        //新增订单

       /* or.setUserId(2);
        or.setDate("2017-8-14");
        or.setPrice(1000);
        num=d.insert(or);
        session.commit();
        System.out.println("总订单增加成功，受到影响的行数是："+num);
        o.setOrderId(3);
        o.setGamegoodId(2);
        o.setPrices(50);
        o.setCount(20);
        double a=o.getPrices();
        int b=o.getCount();
        o.setSummoney(a*b);
        num=dao.insert(o);
        session.commit();
        System.out.println("详细订单增加成功，受到影响的行数是：" + num);*/



    }
}
