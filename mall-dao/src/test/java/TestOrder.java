import com.hzit.dao.OrderDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.GamegoodOrder;
import com.hzit.entity.Order;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Objects;

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
      /*  //新增订单
        o.setOrderId(5);
        o.setUserId(1);
        o.setDate("2017-8-9");
        o.setPrice(500);
        num=dao.insert(o);
        session.commit();
        System.out.println("增加成功，受到影响的行数是："+num);*/

/*
        List<Order> list=dao.selectall();
        for(Object ob:list){
           System.out.println(ob);
         }//查询所有订单*/

        /*List<Order> list=dao.selectbyid(5);
        System.out.println(list);//根据订单号查询订单*/

/*
        o.setOrderId(5);
        o.setUserId(1);
        o.setDate("2017-9-9");
        o.setPrice(500);
        num=dao.update(o);
        session.commit();
        System.out.println("修改成功，受到影响的行数是："+num);//传入订单实体更新对应订单*/

       /* num=dao.delete(4);
        session.commit();
        System.out.println("删除成功，受到影响的行数是："+num);//通过传入订单号删除订单*/
        List<Order> ggo=dao.selectgame(1);
        for(Object ob:ggo){
            System.out.println(ob);
        }


    }
}
