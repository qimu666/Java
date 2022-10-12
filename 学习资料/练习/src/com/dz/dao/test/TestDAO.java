package com.dz.dao.test;

import com.dz.dao.dao.GoodsDAO;
import com.dz.dao.domain.Goods;
import org.junit.Test;

import java.util.List;

public class TestDAO {
    @Test
    public void testGoods() {
        GoodsDAO goodsDAO = new GoodsDAO();
        String sql = "insert into goods value (null,?,?)";
        int affectedRow = goodsDAO.update(sql, "小米11", "2500.0");
        System.out.println(affectedRow > 0 ? "执行成功" : "执行没有影响数据库");
        String sql1 = "select * from goods";
        List<Goods> goods = goodsDAO.QueryMulti(sql1, Goods.class);
        for (Goods actor : goods) {
            System.out.print(actor);
        }
        System.out.println("查询单行记录");
        String sql2 = "select * from goods where id=?";
        Object single = goodsDAO.single(sql2, Goods.class, 1);
        System.out.print(single);
        System.out.println("查询单行单列");
        String sql3 = "select goods_name from goods where id=?";
        Object scalar = goodsDAO.Scalar(sql3,3);
        System.out.print(scalar);
    }
}
