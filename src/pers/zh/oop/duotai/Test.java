package pers.zh.oop.duotai;

/**
 * @author zhanghu
 * @date 2022/12/6 0:54
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(19);

        Administrator admin = new Administrator();
        admin.setName("王五");
        admin.setAge(20);

        register(s);
        register(t);
        register(admin);

    }

    //这个方法既能接受学生、老师还能接收管理员
    //只能把这个方法的参数写成这三个类型的父类
    public static void register(Person p){
        p.show();
    }
}
