package pers.zh.oop.test;

/**
 * @author zhanghu
 * @date 2022/12/5 22:34
 */
public class Student extends Person{


    public Student() {
        //子类构造方法中隐藏的super()去访问父类的无参构造
        super();
        System.out.println("子类的无参构造");
    }

    public Student(String name,int age) {
        super(name, age);
//        super.age = age;
//        super.name =name;
    }

}
