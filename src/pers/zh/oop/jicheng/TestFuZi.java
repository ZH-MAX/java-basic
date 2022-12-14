package pers.zh.oop.jicheng;

/**
 * @author zhanghu
 * @date 2022/12/5 12:31
 */
public class TestFuZi {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.ziShow();
    }
}

class Ye{
    String name = "Ye";
}

class Fu extends Ye{
    String name = "Fu";
}

class Zi extends Fu{
    String name = "Zi";
    public void ziShow(){
        String name = "ziShow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
