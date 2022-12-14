package pers.zh.oop.jicheng;

/**
 * @author zhanghu
 * @date 2022/12/5 13:45
 */
public class TestMethod {
    public static void main(String[] args) {
        Student student = new Student();
        student.lunch();
        OverseasStudent overseasStudent = new OverseasStudent();
        overseasStudent.lunch();
    }
}

class Person {
    public void eat() {
        System.out.println("吃米饭");
    }

    public void drink() {
        System.out.println("喝开水");
    }
}

class OverseasStudent extends Person {

    public void lunch() {
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }

    @Override
    public void eat() {
        System.out.println("吃面");
    }

    @Override
    public void drink() {
        System.out.println("喝凉水");
    }
}

class Student extends Person {
    public void lunch() {
        // 先在本类中查看eat和drink方法，就会调用子类的，
        //如果没有，就会调用从父类继承下来的eat()和drink()方法
        this.eat();
        this.drink();

        //直接调用父类中的eat()和drink()
        super.eat();
        super.drink();
    }
}