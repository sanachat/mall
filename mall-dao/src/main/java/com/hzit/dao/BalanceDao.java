package com.hzit.dao;

import com.hzit.entity.Balance;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年08月09日 - 10:09
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public interface BalanceDao {

    public Balance findBalanceByUserid(Balance balance);

    public int addMoney(Balance balance);

    public int subMoney(Balance balance);

    public int insert(Balance balance);

    public int updatePwd(Balance balance);

}
