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

    public int addMoney(double payMoney);

    public int subMoney(double payMoney);

    public int insert(Balance balance);

    public int updatePwd(Balance balance);

}
