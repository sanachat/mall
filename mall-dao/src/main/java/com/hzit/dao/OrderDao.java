package com.hzit.dao;
import com.hzit.entity.GamegoodOrder;
import com.hzit.entity.Order;
import java.util.List;

/**
 * Created by wan on 2017/8/9.
 */
public interface OrderDao {
    public List<Order> selectall();//查询所有订单
    public List<Order> selectbyid(int orderId);//通过订单号查询
    public List<Order> selectgame(int orderId);//通过订单号关联查询商品信息
    public int update(Order order);//更新订单
    public int delete(int orderId);//根据订单号删除
    public int insert(Order order);//新增订单


}
