package com.hzit.entity;

import java.util.List;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年08月08日 - 10:17
 * |    @description   游戏商品类
 * +---------------------------------Oooo---------------------------------------+
 */
public class GamegoodInfo {
    private  int gameGoodId;
    private String gameGoodName;
    private int gameId;
    private int gameServerId;
    private String roleName;
    private int gameTypeId;
    private int gameGoodSellCount;//游戏商品售出数量
    private int gameGoodCount;//游戏商品上架数量
    private String describe;
    private String sellerName;//卖家店铺名称
    private double unitPrice;//商品单价
    private List<Order> list;
    private String pictureUrl;
    private GameInfo gameInfo;
    private GameServer gameServer;
    private GameType gameType;


    public GameServer getGameServer() {
        return gameServer;
    }

    public void setGameServer(GameServer gameServer) {
        this.gameServer = gameServer;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public GameInfo getGameInfo() {
        return gameInfo;
    }

    public void setGameInfo(GameInfo gameInfo) {
        this.gameInfo = gameInfo;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }



    public int getGameGoodId() {
        return gameGoodId;
    }

    public void setGameGoodId(int gameGoodId) {
        this.gameGoodId = gameGoodId;
    }

    public String getGameGoodName() {
        return gameGoodName;
    }

    public void setGameGoodName(String gameGoodName) {
        this.gameGoodName = gameGoodName;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getGameServerId() {
        return gameServerId;
    }

    public void setGameServerId(int gameServerId) {
        this.gameServerId = gameServerId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getGameTypeId() {
        return gameTypeId;
    }

    public void setGameTypeId(int gameTypeId) {
        this.gameTypeId = gameTypeId;
    }

    public int getGameGoodSellCount() {
        return gameGoodSellCount;
    }

    public void setGameGoodSellCount(int gameGoodSellCount) {
        this.gameGoodSellCount = gameGoodSellCount;
    }

    public int getGameGoodCount() {
        return gameGoodCount;
    }

    public void setGameGoodCount(int gameGoodCount) {
        this.gameGoodCount = gameGoodCount;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public List<Order> getList() {
        return list;
    }

    public void setList(List<Order> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "GamegoodInfo{" +
                "gameGoodId=" + gameGoodId +
                ", gameGoodName='" + gameGoodName + '\'' +
                ", gameId=" + gameId +
                ", gameServerId=" + gameServerId +
                ", roleName='" + roleName + '\'' +
                ", gameTypeId=" + gameTypeId +
                ", gameGoodSellCount=" + gameGoodSellCount +
                ", gameGoodCount=" + gameGoodCount +
                ", describe='" + describe + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", unitPrice=" + unitPrice +
                ", list=" + list +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", gameInfo=" + gameInfo +
                ", gameServer=" + gameServer +
                ", gameType=" + gameType +
                '}';
    }
}
