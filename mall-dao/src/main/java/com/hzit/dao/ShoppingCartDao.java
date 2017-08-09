package com.hzit.dao;

import com.hzit.entity.ShoppingCart;

import java.util.List;

/**
 * Created by THINK on 2017/8/9.
 */
public interface ShoppingCartDao {
    public List<ShoppingCart> findshoppingcart(int userId);
    public int insertshoppingcart(ShoppingCart shoppingCart);
    public int deleteshoppingcart(int shopId);

}
