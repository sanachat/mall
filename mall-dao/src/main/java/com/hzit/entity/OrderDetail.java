package com.hzit.entity;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年08月11日 - 17:09
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class OrderDetail {
    private int detailId;
    private int orderId;
    private int gamegoodId;
    private double price;
    private int count;
    private double summoney;

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getGamegoodId() {
        return gamegoodId;
    }

    public void setGamegoodId(int gamegoodId) {
        this.gamegoodId = gamegoodId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSummoney() {
        return summoney;
    }

    public void setSummoney(double summoney) {
        this.summoney = summoney;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "detailId=" + detailId +
                ", orderId=" + orderId +
                ", gamegoodId=" + gamegoodId +
                ", price=" + price +
                ", count=" + count +
                ", summoney=" + summoney +
                '}';
    }
}
