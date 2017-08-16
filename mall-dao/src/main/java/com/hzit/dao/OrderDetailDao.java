package com.hzit.dao;

import com.hzit.entity.OrderDetail;

import java.util.List;

/**
 * Created by wan on 2017/8/14.
 */
public interface OrderDetailDao {
    public int insert(OrderDetail o);
    public int update(OrderDetail o);
    public int delete(OrderDetail o);
    public List<OrderDetail> findbyid(int orderId);
    public List<OrderDetail> findall();
}
