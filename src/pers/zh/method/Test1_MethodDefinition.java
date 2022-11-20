package pers.zh.method;

/**
 *
 * 方法是一种抽象思维，把需要重复使用的代码抽象出来定义，必要的时候可以通过调用来使用，避免代码重复
 *
 * @author zhanghu
 * @date 2022/11/17 14:06
 */
public class Test1_MethodDefinition {
    public static void main(String[] args) {
        getMenu();//方法调用，此时方法才能被运行
    }

    /**
     * public   访问权限修饰符
     * static   静态修饰符，描述的方式可以直接调用
     * void     返回值（无返回值）
     * getMenu  方法名
     */
    public static void getMenu(){
        System.out.println("菜单");
    }
}
