package pers.zh.oop.duotai;

/**
 * @author zhanghu
 * @date 2022/12/6 0:50
 */
public class Teacher extends Person{
    @Override
    public void show() {
//        super.show();
        System.out.println("老师的信息为："+getName()+","+getAge());
    }
}
