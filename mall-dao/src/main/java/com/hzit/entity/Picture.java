package com.hzit.entity;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年08月08日 - 10:16　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class Picture {
    private int pictureId;
    private String pictureName;
    private String pictureUrl;

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "pictureId=" + pictureId +
                ", pictureName='" + pictureName + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                '}';
    }
}

