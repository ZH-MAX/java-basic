package pers.zh.method.qianfeng;

/**
 * @author zhanghu
 * @date 2022/11/22 14:45
 */
public class TestFunction {
    public static void main(String[] args) {
        System.out.println("1");
        printSign();
        System.out.println("2");
        printSign();
        System.out.println("3");
        printSign();
        System.out.println("4");
        printSign();
    }
    public static void printSign(){
        for (int i = 0; i < 10; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
