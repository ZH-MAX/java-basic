package pers.zh.method.test;

/**
 * @author zhanghu
 * @date 2023/1/22 16:30
 */
public class MethodDemo1Test {
    public static void main(String[] args) {

        System.out.println("开始");
        getMax();
        System.out.println("结束");

    }

    public static void getMax() {
        int num1 = 10;
        int num2 = 20;

        int max = num1 > num2 ? num1 : num2;

        System.out.println(max);
    }
}
