package com.hzit.dao;

import com.hzit.entity.UserInfo;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年08月09日 - 9:19
 * |    @description   用户表
 * +---------------------------------Oooo-----------------------------+
 */
public interface UserinfoDao {

    public int insertUser(UserInfo userInfo);

    public int updateUser(UserInfo userInfo);

    public UserInfo checkLogin(UserInfo userInfo);

}
