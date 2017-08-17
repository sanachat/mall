package com.hzit.dao;

import com.hzit.entity.ShoppingCart;

import java.util.List;

/**
 * Created by THINK on 2017/8/9.
 */
public interface ShoppingCartDao {
    public List<ShoppingCart> findshoppingcart(int userId);//根据用户显示购物车商品
    public int insertshoppingcart(ShoppingCart shoppingCart);//增加购物车内容
    public int deleteshoppingcart(int shopId);//根据编号删除
    public int allmoney(int userId);//结算所有商品
    public int banlanceBygameGoodId(int userId,int shopId);//结算单个商品
    public int banAll(int userId);//结算所有商品

}
