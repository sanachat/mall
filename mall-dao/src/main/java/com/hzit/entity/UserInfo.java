package com.hzit.entity;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年08月08日 - 10:13
 * |  @description 用户实体类
 * +---------------------------------Oooo---------------------------------------+
 */
public class UserInfo {
    private int userId;
    private String loginName;//登陆名
    private String loginPwd;//登陆密码
    private String pwdQuestion;//找回密码验证问题
    private String pwdAnswer;//找回密码验证答案
    private String userSex;
    private String userName;//真实姓名
    private String tel;
    private String address;
    private String idCard;
    private String storeName;//店铺名称
    private String userEmail;
    private int roleId;
    private int userStateId;
    private UserState userState;
    private RoleInfo roleInfo;

    public int getUserStateId() {
        return userStateId;
    }

    public void setUserStateId(int userStateId) {
        this.userStateId = userStateId;
    }



    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getPwdQuestion() {
        return pwdQuestion;
    }

    public void setPwdQuestion(String pwdQuestion) {
        this.pwdQuestion = pwdQuestion;
    }

    public String getPwdAnswer() {
        return pwdAnswer;
    }

    public void setPwdAnswer(String pwdAnswer) {
        this.pwdAnswer = pwdAnswer;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", loginName='" + loginName + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", pwdQuestion='" + pwdQuestion + '\'' +
                ", pwdAnswer='" + pwdAnswer + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userName='" + userName + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", idCard='" + idCard + '\'' +
                ", storeName='" + storeName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", roleId=" + roleId +
                ", userStateId=" + userStateId +
                ", userState=" + userState +
                ", roleInfo=" + roleInfo +
                '}';
    }
}
