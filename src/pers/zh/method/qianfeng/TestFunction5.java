package pers.zh.method.qianfeng;

/**
 * @author zhanghu
 * @date 2022/11/22 16:40
 */
public class TestFunction5 {
    public static void main(String[] args) {
        double result = cacl(1.5, 10.2);
        System.out.println("计算结果："+result);
    }

    public static double cacl(double a,double b) {
        double sum = a+b;
        System.out.println("运算结束");
        return sum;//结束当前方法，并伴有返回值，返回到方法调用处
    }
}
