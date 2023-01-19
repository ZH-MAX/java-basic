package pers.zh.method;

/**
 *
 *
 * @author zhanghu
 * @date 2023/1/16 22:36
 */
public class MethodDemo1 {

    public static void customer(){
        System.out.println("顾客");
    }

    public static void main(String[] args) {
        farmer();
        cook();
        customer();
        farmer();
        cook();
        customer();
    }

    public static void farmer(){
        System.out.println("农民");
    }

    public static void cook(){
        System.out.println("厨师");
    }
}
