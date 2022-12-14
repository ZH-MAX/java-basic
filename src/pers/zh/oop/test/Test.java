package pers.zh.oop.test;

/**
 * @author zhanghu
 * @date 2022/12/5 23:40
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s = new Student("张三",34);
        System.out.println(s.name+","+s.age);

    }
}
