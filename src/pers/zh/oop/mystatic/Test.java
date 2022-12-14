package pers.zh.oop.mystatic;

import java.util.ArrayList;

/**
 * @author zhanghu
 * @date 2022/12/3 20:48
 */
public class Test {
    public static void main(String[] args) {
        // 创建一个集合用来存储学生对象
        ArrayList<Student> list = new ArrayList<>();

        //创建3个学生对象
        Student stu1 = new Student("zhangsan",23,"男");
        Student stu2 = new Student("lisi",24,"女");
        Student stu3 = new Student("wangwu",25,"男");

        //把学生对象添加到集合中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);

    }
}
