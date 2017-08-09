package com.hzit.dao;

import com.hzit.entity.UserInfo;

import java.util.List;

/**
 * Created by Administrator on 2017/8/9.
 */
public interface UserInfoDao {
    public List<UserInfo> findAll();
    public int deleteUser(int userId);//删除用户
    public int insertAdmin(String name,String password);//增加管理员
    public int updateSeller(int userId);//成为卖家
    public UserInfo selectOne(String name,String password);//根据返回的Userinfo 中的角色来跳转不同主页（用户状态为2不能登录）
    public int insertUser(UserInfo userInfo);//默认注册成为买家
    public int updateUser(UserInfo userInfo);//个人信息管理，修改登录密码等
    public int updateUserState(int userid);//修改用户状态
    public UserInfo checkLogin(UserInfo userInfo);//登录检查登录名和密码
}
