package com.hzit.dao;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年08月09日 - 11:49　                    
 *  |    @description   用户投诉和管理员处理投诉dao层　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import com.hzit.entity.ComplainInfo;

import java.util.List;

public interface ComplainInfoDao {
    public List<ComplainInfo> findAll();
    public ComplainInfo findComplainById(int userId);
    public int insertComplain(ComplainInfo complainInfo);
    public int deleteComplain(int complainId);

}
