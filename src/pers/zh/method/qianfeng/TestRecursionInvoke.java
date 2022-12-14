package pers.zh.method.qianfeng;

/**
 *
 * Exception in thread "main" java.lang.StackOverflowError
 *
 * @author zhanghu
 * @date 2022/11/26 16:11
 */
public class TestRecursionInvoke {
    public static void main(String[] args) {
        m1();
    }

    public static void m1(){
        System.out.println("m1() - start");
        m1();
        System.out.println("m1() - end");
    }
}
