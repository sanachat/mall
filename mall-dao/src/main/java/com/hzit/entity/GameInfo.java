package com.hzit.entity;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年08月08日 - 10:20　                    
 *  |    @description   游戏表　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

public class GameInfo {
    private int gameId;
    private String gameName;
    private String gameArea;

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameArea() {
        return gameArea;
    }

    public void setGameArea(String gameArea) {
        this.gameArea = gameArea;
    }

    @Override
    public String toString() {
        return "GameInfo{" +
                "gameId=" + gameId +
                ", gameName='" + gameName + '\'' +
                ", gameArea='" + gameArea + '\'' +
                '}';
    }
}
