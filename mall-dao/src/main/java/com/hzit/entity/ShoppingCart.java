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
    private String gameGoodName;
    private int num;
    private int gameGoodId;

    public int getGameGoodId() {
        return gameGoodId;
    }

    public void setGameGoodId(int gameGoodId) {
        this.gameGoodId = gameGoodId;
    }

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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getGameGoodName() {
        return gameGoodName;
    }

    public void setGameGoodName(String gameGoodName) {
        this.gameGoodName = gameGoodName;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "shopId=" + shopId +
                ", userId=" + userId +
                ", price=" + price +
                ", gameGoodName='" + gameGoodName + '\'' +
                ", num=" + num +
                ", gameGoodId=" + gameGoodId +
                '}';
    }
}
