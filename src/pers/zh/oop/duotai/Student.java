package pers.zh.oop.duotai;

/**
 * @author zhanghu
 * @date 2022/12/6 0:48
 */
public class Student extends Person{
    @Override
    public void show() {
//        super.show();
        System.out.println("学生的信息为："+getName()+","+getAge());
    }
}
