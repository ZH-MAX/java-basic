package pers.zh.test;

/**
 * 基本查找（顺序查找）：
 * 需求：定义一个方法利用基本查找，查询某个元素是否存在
 * 数据如下：{131,127,147,81,103,23,7,79}
 * 核心：从0索引开始挨个往后查找
 *
 * @author zhanghu
 * @date 2022/12/13 16:03
 */
public class A01_BasicSearchTest01 {
    public static void main(String[] args) {
        int[] arr = {131,127,147,81,103,23,7,79};
        int num = 1;
        int search = basicSearch(arr, num);
        System.out.println(search);
    }

    public static int basicSearch(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }
}



