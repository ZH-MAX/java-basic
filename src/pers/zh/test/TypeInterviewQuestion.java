package pers.zh.test;

/**
 * @author zhanghu
 * @date 2023/1/14 17:01
 */
public class TypeInterviewQuestion {
    public static void main(String[] args) {
        byte b1 = 3;
        byte b2 = 4;
        int b3= b1+b2;  //b1、b2是两个变量
        System.out.println(b3);

        /**
         * java存在常量优化机制：在编译的时候（javac）就会将3和4这两个字面量进行运算，
         *                    产生的字节码文件：byte b = 7
         */
        byte b = 3+4;
        System.out.println(b);
    }
}
