package com.hzit.entity;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年08月08日 - 10:35
 * |    @description   游戏类型
 * +---------------------------------Oooo-----------------------------+
 */
public class GameType {
    private int gameTypeId;
    private String gameTypeName;

    public int getGameTypeId() {
        return gameTypeId;
    }

    public void setGameTypeId(int gameTypeId) {
        this.gameTypeId = gameTypeId;
    }

    public String getGameTypeName() {
        return gameTypeName;
    }

    public void setGameTypeName(String gameTypeName) {
        this.gameTypeName = gameTypeName;
    }

    @Override
    public String toString() {
        return "GameType{" +
                "gameTypeId=" + gameTypeId +
                ", gameTypeName='" + gameTypeName + '\'' +
                '}';
    }
}
