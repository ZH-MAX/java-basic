package pers.zh.method.qianfeng;

/**
 * 计算阶乘 5!
 *
 * @author zhanghu
 * @date 2022/11/26 16:31
 */
public class TestFactorial {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial);
    }

//    public static int factorial(int n){
//        int sum = 1;
//        for (int i = 2; i <= n; i++) {
//            sum *= i;
//        }
//        return sum;
//    }

    public static int factorial(int n) {
        if (n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
