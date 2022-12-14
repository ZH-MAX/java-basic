package pers.zh.oop.mystatic;

/**
 * @author zhanghu
 * @date 2022/12/1 23:38
 */
public class StudentTest {
    public static void main(String[] args) {

        Student.teacherName = "罗老师";

        Student student1 = new Student();
        student1.setName("张三");
        student1.setAge(18);
        student1.setGender("男");
//        student1.teacherName = "罗老师";

        student1.study();
        student1.show();

        Student student2 = new Student();
        student2.setName("李四");
        student2.setAge(19);
        student2.setGender("女");

        student2.study();
        student2.show();
    }
}
