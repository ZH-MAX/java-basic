package pers.zh.reflective.qianfeng;

import java.io.Serializable;

/**
 *Person类
 *
 * @author zhanghu
 * @date 2022/11/22 9:23
 */
public class Person implements Serializable ,Cloneable{

    String name;
    int age;

    public Person() {
        System.out.println("无参构造执行了");
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
        System.out.println("带参构造方法执行了...");
    }


    public void eat(){
        System.out.println(name+"正在吃东西...");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
