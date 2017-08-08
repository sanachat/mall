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
    private int UserStateId;
    private int UserId;
    private int UserState;//1:正常/0:屏蔽

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getUserState() {
        return UserState;
    }

    public void setUserState(int userState) {
        UserState = userState;
    }

    public int getUserStateId() {
        return UserStateId;
    }

    public void setUserStateId(int userStateId) {
        UserStateId = userStateId;
    }

    @Override
    public String toString() {
        return "UserState{" +
                "UserStateId=" + UserStateId +
                ", UserId=" + UserId +
                ", UserState=" + UserState +
                '}';
    }
}
