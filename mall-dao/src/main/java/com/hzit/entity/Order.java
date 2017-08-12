package com.hzit.entity;

import java.util.List;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年08月08日 - 10:36
 * |    @description   订单
 * +---------------------------------Oooo-----------------------------+
 */
public class Order {
    private int orderId;
    private int userId;
    private String date;
    private double price;
    private List<OrderDetail> orderDetail;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<OrderDetail> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", date='" + date + '\'' +
                ", price=" + price +
                ", orderDetail=" + orderDetail +
                '}';
    }
}
