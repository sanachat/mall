package com.hzit.dao;

import com.hzit.entity.UserInfo;

import java.util.List;

/**
 * Created by Administrator on 2017/8/9.
 */
public interface UserInfoDao {
    public List<UserInfo> findAll();
    public int deleteUser(int userId);//删除用户
    public int insertAdmin(String name, String password,String realname);//增加管理员
    public int updateSeller(int userId);//成为卖家
    public int insertUser(UserInfo userInfo);//默认注册成为买家
    public int updateUser(UserInfo userInfo);//个人信息管理，修改登录密码等
    public UserInfo checkLogin(UserInfo userInfo);//检查登录名和密码
    public int stUserState(int userid);
    public int fzUserState(int userid);
    public List<UserInfo> findUserById(int userid);
}
