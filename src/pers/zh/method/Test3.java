package pers.zh.method;

/**
 * @author zhanghu
 * @date 2022/11/21 10:52
 */
public class Test3 {
    public static void main(String[] args) {
        boolean bool = isLeapYear(2020);
        if (bool){
            System.out.println("闰年");
        }
        else {
            System.out.println("平年");
        }

        print();
    }

    public static boolean isLeapYear(int year){
        if ((year%4==0&&year%100!=0)||year%400==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void print(){
        for (int i = 0; i < 10; i++) {
            if (i==5){
                return;//表示方法结束
            }
            System.out.print(i);
        }
    }
}
