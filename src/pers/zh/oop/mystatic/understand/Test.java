package pers.zh.oop.mystatic.understand;

/**
 * @author zhanghu
 * @date 2022/12/3 21:08
 */
public class Test {
    public static void main(String[] args) {
        Student.teachName = "罗翔";

        Student s1 = new Student();
        System.out.println("s1："+s1);
        //s1：pers.zh.oop.mystatic.understand.Student@74a14482
        s1.name = "zhangsan";
        s1.age = 23;
        s1.show();

        System.out.println("=======================");

        Student s2 = new Student();
        System.out.println("s2："+s2);
        //s2：pers.zh.oop.mystatic.understand.Student@1540e19d
        s2.name = "lisi";
        s2.age = 18;
        s2.show();
    }
}
