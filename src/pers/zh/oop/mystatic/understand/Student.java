package pers.zh.oop.mystatic.understand;

/**
 * 总结：
 *      静态方法中没有this关键字
 *      静态方法中，只能访问静态
 *      非静态方法可以访问所有
 *
 *
 *
 * @author zhanghu
 * @date 2022/12/3 21:00
 */
public class Student {
    String name;
    int age;
    static String teachName;

    //this ：表示当前方法调用者的地址值。
    //这个this：是由虚拟机赋值的
    public void show(Student this) {
        method();
        System.out.println("this："+this);
        //第一次this：pers.zh.oop.mystatic.understand.Student@74a14482
        //第二次this：pers.zh.oop.mystatic.understand.Student@1540e19d
        System.out.println(name + "," + age + "," + teachName);
    }

    public static void method(){

        System.out.println("静态方法");
    }
}
