package pers.zh.multithreading.test;

/**
 * @author zhanghu
 * @date 2022/11/17 14:37
 */
public class Thread01 {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();//启动线程

        //推荐
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.start();//启动线程
    }
}

//实现线程的第一种方式：继承Thread类
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}

//实现线程的第二种方式：实现Runnable接口
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}

class MyRunnable3 implements Runnable{
    public boolean flag = true;

    public MyRunnable3() {
        flag = true;
    }

    @Override
    public void run() {
        int i=0;
        while (flag){
            System.out.println(Thread.currentThread().getName()+"=============="+i++);
        }
    }

}