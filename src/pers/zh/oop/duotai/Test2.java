package pers.zh.oop.duotai;

/**
 *
 * 多态调用成员变量：编译看左边，运行也看左边
 *      编译看左边：javac编译代码的时候，会看左边的父类中有没有这个变量；有，编译成功；没有，编译失败
 *      运行也看左边：java运行代码的时候，实际获取的就是左边父类中成员变量的值
 * 多态调用成员方法：编译看左边，运行看右边
 *       编译看左边：javac编译代码的时候，会看左边的父类中有没有这个方法；有，编译成功；没有，编译失败
 *       运行看右边：java运行代码的时候，实际上运行的是子类中的方法
 *
 * @author zhanghu
 * @date 2022/12/6 9:06
 */
public class Test2 {
    public static void main(String[] args) {

        //创建对象（多态方式）
        //Fu f = new Zi();
        Animal a = new Dog();
        System.out.println(a.name);//动物
        a.show();//Dog ---  show()

        //instanceof：判断a是不是狗类型
        if (a instanceof Dog){
            Dog d = (Dog) a;
            d.eat();
        }else if (a instanceof Cat){
            Cat c = (Cat) a;
            c.eat();
        }else {
            System.out.println("没有这个类型，无法转换");
        }

        //java14新特性
//        if (a instanceof Dog d){
//            d.eat();
//        }else if (a instanceof Cat c){
//            c.eat();
//        }else {
//            System.out.println("没有这个类型，无法转换");
//        }
    }
}

class Animal{
    String name = "动物";

    public void show(){
        System.out.println("Animal ---  show()");
    }
}

class Dog extends Animal{
    String name = "狗";

    public void eat(){
        System.out.println("狗吃骨头");
    }

    @Override
    public void show() {
        System.out.println("Dog ---  show()");
    }
}

class Cat extends Animal{
    String name = "🐱";

    public void eat(){
        System.out.println("猫吃肉");
    }

    @Override
    public void show() {
        System.out.println("Cat ---  show()");
    }
}
