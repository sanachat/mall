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
    private Order order;
    private GamegoodInfo gamegoodInfo;

    public GamegoodInfo getGamegoodInfo() {
        return gamegoodInfo;
    }

    public void setGamegoodInfo(GamegoodInfo gamegoodInfo) {
        this.gamegoodInfo = gamegoodInfo;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
