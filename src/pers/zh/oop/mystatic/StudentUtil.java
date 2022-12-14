package pers.zh.oop.mystatic;

import java.util.ArrayList;

/**
 * @author zhanghu
 * @date 2022/12/3 20:51
 */
public class StudentUtil {

    private StudentUtil(){}

    //静态方法
    public static int getMaxAge(ArrayList<Student> list){
//        int max = list.get(0).getAge();
//        for (int i = 1; i < list.size(); i++) {
//            //i 索引    list.get(i)集合里的元素/学生对象   list.get(i).getAge()
//            if (list.get(i).getAge() > max){
//                max = list.get(i).getAge();
//            }
//        }
//        return max;
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            //i 索引    list.get(i)集合里的元素/学生对象   list.get(i).getAge()
            int tempAge = list.get(i).getAge();
            if (tempAge > max){
                max = tempAge;
            }
        }
        return max;
    }
}
