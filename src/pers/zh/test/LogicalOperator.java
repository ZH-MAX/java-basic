package pers.zh.test;

/**
 * 短路逻辑运算符
 *
 *      && ：具有短路效果，左边为false，右边不执行了
 *                      左边为true，右边继续执行
 *
 *      || ：具有短路效果，左边为true，右边不执行了
 *  *                      左边为false，右边继续执行
 *
 *
 * @author zhanghu
 * @date 2023/1/15 7:20
 */
public class LogicalOperator {
    public static void main(String[] args) {

        int x = 3;
        int y = 4;

        boolean res = ++x > 5 & y-- < 4;

        System.out.println(x);  //4
        System.out.println(y);  //3
        System.out.println(res);//false

        System.out.println("----------");

        int a = 3;
        int b = 4;

        boolean c = ++a > 5 && b-- < 4;

        System.out.println(a);  //4
        System.out.println(b);  //4
        System.out.println(c);//false



    }
}
