package pers.zh.reflective.qianfeng;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 *
 * 获取类对象三种方式：
 * 1、通过类的对象，获取类对象
 *      Student s = new Student()
 *      Class c = s.getClass()
 * 2、通过类名获取类对象
 *      Class c = 类名.class
 * 3、通过静态方法获取类对象（推荐使用）
 *      Class c = Class.forname("包名.类名")
 *
 *
 * 反射常用方法
 *   public String getName()                  获取类对象所代表的类的名字
 *   public Package getPackage()              当前类对象所代表的包
 *   public Class<? superT> getSuperclass()   获取父类
 *   public Class<?>[] getInterfaces()        获取当前类实现的接口（类实现的接口可能有多个，所以用数组）
 *
 *   public Constructor<?>[] getConstructor()
 *   public T newInstance()                    使用当前类对象创建一个实例
 *   public Method[] getMethods()              获取方法
 *   public Field[] getFields()                获取字段
 *
 *
 * @author zhanghu
 * @date 2022/11/22 9:25
 */
public class TestPerson {
    public static void main(String[] args) throws Exception{
//        Person zhangsan = new Person();
//        zhangsan.name = "张三";
//        zhangsan.eat();
//        getClazz();

//        reflectOpe1();
        reflectOpe2();
    }

    //获取类对象的三种方式
    public static void getClazz() throws Exception{
       /*
           1、通过类的对象，获取类对象
              Student s = new Student()
              Class c = s.getClass()
        */
        Person zhangsan = new Person();
        Class<?> class1 = zhangsan.getClass();
        System.out.println(class1.hashCode());//1956725890

        /*
            2、通过类名获取类对象
               Class c = 类名.class
         */
        Class<?> class2 = Person.class;
        System.out.println(class2.hashCode());//1956725890

        /*
            3、通过静态方法获取类对象
             Class c = Class.forname("包名.类名")
         */
        Class<?> class3 = Class.forName("pers.zh.reflective.qianfeng.Person");
        System.out.println(class3.hashCode());//1956725890

    }

    //1.使用反射获取类的名字、包名、父类、接口
    /*public static void reflectOpe1() throws Exception{
        //获取类对象
        Class<?> class1 = Class.forName("pers.zh.reflective.qianfeng.Person");

        //getName
        System.out.println(class1.getName());//pers.zh.reflective.qianfeng.Person
        System.out.println(class1.getSimpleName());//Person

        //getPackage()
        System.out.println(class1.getPackage());//package pers.zh.reflective.qianfeng
        System.out.println(class1.getPackage().getName());//pers.zh.reflective.qianfeng

        //getSuperclass()
        System.out.println(class1.getSuperclass().getName());//java.lang.Object

        //getInterfaces()
        Class<?>[] interfaces = class1.getInterfaces();
        System.out.println(interfaces);//[Ljava.lang.Class;@74a14482
        System.out.println(Arrays.toString(interfaces));//[interface java.io.Serializable, interface java.lang.Cloneable]

    }*/

    //2.使用反射获取类的构造方法，创建对象
    public static void reflectOpe2() throws Exception{
        //(1)获取类对象
        Class<?> class1 = Class.forName("pers.zh.reflective.qianfeng.Person");
        //(2)获取类的构造方法Constructor
        /*Constructor<?>[] cons = class1.getConstructors();
        for (Constructor<?> con : cons) {
            System.out.println(con.toString());
        }*/

        //(3)获取类中无参构造
        Constructor<?> con = class1.getConstructor();//()没写任何参数，所以调用无参构造
        Person zhangsan = (Person) con.newInstance();// = Object zhangsan = con.newInstance();
        Person lisi = (Person) con.newInstance();
        System.out.println(zhangsan.toString());
        System.out.println(lisi.toString());
        //简便方法
        Person wangwu = (Person) class1.newInstance();
        System.out.println(wangwu.toString());

        //(4)获取类中带参构造
        Constructor<?> con2 = class1.getConstructor(String.class, int.class);
        Person xiaoli = (Person)con2.newInstance("晓丽", 20);
        System.out.println(xiaoli.toString());

    }
}
