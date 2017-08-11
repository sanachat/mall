import com.hzit.dao.ShoppingCartDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.ShoppingCart;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;
public class TestShop {
    public static void main(String[] args) {
        SqlSession session= SqlSessionHelper.getSqlSession();
        ShoppingCartDao dao=session.getMapper(ShoppingCartDao.class);
        List<ShoppingCart> list=new ArrayList<ShoppingCart>();
        list=dao.findshoppingcart(1);
        for(ShoppingCart s:list){
            System.out.println(s);
        }
        session.commit();

       /* ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.setUserId(1);
        shoppingCart.setShopId(4);
        shoppingCart.setCount(2);
        shoppingCart.setPrice(21);
        shoppingCart.setGameGoodId(2);
        dao.insertshoppingcart(shoppingCart);
        session.commit();
        System.out.println(shoppingCart);*/
/*
        int num=0;
        num=dao.allmoney(1);
        System.out.println(num);*/



    }
}

