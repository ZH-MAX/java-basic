package pers.zh.collection;

import java.util.ArrayList;

/**
 * @author zhanghu
 * @date 2022/11/16 16:16
 */
public class Java02_ArrayList {
    public static void main(String[] args) {
        //1.创建集合的对象
        //泛型：限定集合中存储数据的类型
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("aaa");
        list.add("aaa");
        list.add("bbb");

        System.out.println(list);

      /*  //删除
        list.remove("aaa");
        System.out.println(list);

        //删除根据索引
        String remove = list.remove(0);//返回被删除的元素
        System.out.println(remove);
        System.out.println(list);*/

        //修改元素
        String result = list.set(1, "ccc");
        System.out.println(result);//返回被覆盖的元素
        System.out.println(list);
    }
}
