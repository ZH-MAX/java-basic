package pers.zh.method.qianfeng;

/**
 * @author zhanghu
 * @date 2022/11/22 15:44
 */
public class TestFunction4 {
    public static void main(String[] args) {

        int result = add(5, 10);
        System.out.println(result);//15

        int result2 = add(result,15);
        System.out.println(result2);//30
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}
