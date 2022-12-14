package pers.zh.oop.test;

/**
 * @author zhanghu
 * @date 2022/12/5 14:57
 */
public class SharPei extends Dog {
    @Override
    public void eat() {
        super.eat();
        System.out.println("吃骨头");
    }
}
