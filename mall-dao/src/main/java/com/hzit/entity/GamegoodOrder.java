package com.hzit.entity;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年08月09日 - 15:08
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class GamegoodOrder {
    private int orderId;
    private int userId;
    private int gamegoodId;
    private String gamegoodname;
    private int gameId;

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

    public int getGamegoodId() {
        return gamegoodId;
    }

    public void setGamegoodId(int gamegoodId) {
        this.gamegoodId = gamegoodId;
    }

    public String getGamegoodname() {
        return gamegoodname;
    }

    public void setGamegoodname(String gamegoodname) {
        this.gamegoodname = gamegoodname;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    @Override
    public String toString() {
        return "GamegoodOrder{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", gamegoodId=" + gamegoodId +
                ", gamegoodname='" + gamegoodname + '\'' +
                ", gameId=" + gameId +
                '}';
    }
}
