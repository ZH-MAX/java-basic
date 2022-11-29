package pers.zh.method.qianfeng;

/**
 * @author zhanghu
 * @date 2022/11/22 15:32
 */
public class TestFunction3 {
    public static void main(String[] args) {
    System.out.println("1");
    printSign(5,'*');
    System.out.println("2");
    printSign(6,'-');
    System.out.println("3");
    printSign(7,'a');
    System.out.println("4");
    printSign(8,'&');
}
    public static void printSign(int count,char sign){
        for (int i = 0; i < count; i++) {
            System.out.print(sign);
        }
        System.out.println();
    }
}

