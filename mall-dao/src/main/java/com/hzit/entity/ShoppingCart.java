package com.hzit.entity;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月08日 - 18:55
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class ShoppingCart
{
    private int shopId;
    private int userId;
    private double price;
    private int gameGoodId;
    private int sum;




    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getGameGoodId() {
        return gameGoodId;
    }

    public void setGameGoodId(int gameGoodId) {
        this.gameGoodId = gameGoodId;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "shopId=" + shopId +
                ", userId=" + userId +
                ", price=" + price +
                ", gameGoodId=" + gameGoodId +
                ", count=" + sum +
                '}';
    }
}
