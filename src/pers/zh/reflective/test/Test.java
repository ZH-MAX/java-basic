package pers.zh.reflective.test;

import java.lang.reflect.Method;

/**
 * @author zhanghu
 * @date 2022/11/22 8:46
 */
public class Test {
    public static void main(String[] args) throws Exception{
        //加载类：加载 到方法区
        Class clazz = Class.forName("pers.zh.reflective.test.User");

        //创建对象
        Object instance = clazz.newInstance();// = new User()

        //调用属性
//        Field fieldName = clazz.getField("name");//只能获取公共的
//        System.out.println(fieldName.getName());
        //不允许获取私有的。破坏了类的封装性
//        Field fieldName = clazz.getDeclaredField("name");//获取公共的、私有的
//        System.out.println(fieldName.getName());

        //通过获取public方法，来给私有的属性赋值
        Method[] ms = clazz.getMethods();//获取类中的属性的公共方法，包含父类的
        for (int i = 0; i < ms.length; i++) {
            Method m = ms[i];
//            System.out.println(m.getName());
            //过滤父接口的方法：判断方法的声明接口
            if (m.getDeclaringClass().isAssignableFrom(clazz.getClass())
            && m.getName().startsWith("set")){
                String getMethodName = m.getName().replace("set", "get");
                Method methodGet = clazz.getMethod(getMethodName);
                Class<?> returnType = methodGet.getReturnType();
                System.out.println(returnType);
            }
        }

        //调用方法
    }
}
