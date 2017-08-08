package com.hzit.entity;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年08月08日 - 10:22　                    
 *  |    @description   游戏服务器　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

public class GameServer {
    private int gameServerId;
    private int gameId;
    private String gameServerName;

    public int getGameServerId() {
        return gameServerId;
    }

    public void setGameServerId(int gameServerId) {
        this.gameServerId = gameServerId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameServerName() {
        return gameServerName;
    }

    public void setGameServerName(String gameServerName) {
        this.gameServerName = gameServerName;
    }

    @Override
    public String toString() {
        return "GameServer{" +
                "gameServerId=" + gameServerId +
                ", gameId=" + gameId +
                ", gameServerName='" + gameServerName + '\'' +
                '}';
    }
}
