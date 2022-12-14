package pers.zh.oop.qianfeng;

/**
 * @author zhanghu
 * @date 2022/11/30 10:35
 */
public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="张三";
//        s1.age = 18;
        s1.setAge(19);
//        s1.sex = "男";
        s1.setSex("女");
        s1.score = 100;

        s1.sayHi();
    }
}
