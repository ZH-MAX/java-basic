package pers.zh.oop.qianfeng;

/**
 * @author zhanghu
 * @date 2022/11/30 10:22
 */
public class Student {
    String name;
    private int age;
    private String sex;
    double score;

    public void sayHi() {
        System.out.println("姓名：" + this.name + " 年龄：" + this.age + " 性别：" + this.sex + " 分数：" + this.score);
    }

    public void setAge(int age) {
        //判断
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("非法年龄");
        }

    }

    public int getAge() {
        return this.age;
    }

    public void setSex(String sex) {
        if (sex.equals("男") || sex.equals("女")) {
            this.sex = sex;
        } else {
            System.out.println("非法性别");
        }

    }

    public String getSex() {
        return this.sex;
    }
}
