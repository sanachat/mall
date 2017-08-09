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
        int num=0;
        List<ShoppingCart> list=new ArrayList<ShoppingCart>();
        list=dao.findshoppingcart(1);
        for(ShoppingCart s:list){
            System.out.println(s);
        }
        session.commit();

    }
}

