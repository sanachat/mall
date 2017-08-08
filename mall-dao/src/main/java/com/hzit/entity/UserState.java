package com.hzit.entity;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年08月08日 - 10:08
 * |  @description   用户状态
 * +---------------------------------Oooo---------------------------------------+
 */
public class UserState {
    private int userStateId;//状态id,主键自增

    private int userState;//正常/屏蔽


    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }

    public int getUserStateId() {
        return userStateId;
    }

    public void setUserStateId(int userStateId) {
        this.userStateId = userStateId;
    }

    @Override
    public String toString() {
        return "UserState{" +
                "userStateId=" + userStateId +
                ",  userState=" + userState +
                '}';
    }
}
