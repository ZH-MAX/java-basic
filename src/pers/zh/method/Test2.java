package pers.zh.method;

import java.util.Scanner;

/**
 * @author zhanghu
 * @date 2022/11/20 22:38
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        printStr(line);
    }

    /**
     * 带参数的方法
     * @param line
     */
    public static void printStr(int line){
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
