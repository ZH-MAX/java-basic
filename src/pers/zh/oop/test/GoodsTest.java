package pers.zh.oop.test;

/**
 * @author zhanghu
 * @date 2022/11/21 14:55
 */
public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("001","华为",59999.0,100);
        Goods g2 = new Goods("002","保温杯",59999.0,100);
        Goods g3 = new Goods("003","枸杞",59999.0,100);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            //i 索引   arr[i] 元素
            Goods goods = arr[i];
            System.out.println(goods.getId()+","+goods.getName()
            +","+goods.getPrice()+","+goods.getCount());
        }
    }
}
