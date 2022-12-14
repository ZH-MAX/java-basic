package pers.zh.oop.test;

/**
 * @author zhanghu
 * @date 2022/12/5 22:15
 */
public class Person {

    String name;
    int age;

    public Person(){
        System.out.println("父类的无参构造");
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}
