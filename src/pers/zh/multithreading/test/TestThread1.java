package pers.zh.multithreading.test;

/**
 *
 * 创建线程方式1：继承Thread类，重写run()方法，调用start方法开启线程
 * 注意：线程开启不一定立即执行，由cpu调度执行
 *
 *
 * @author zhanghu
 * @date 2022/11/18 15:53
 */
public class TestThread1 extends Thread{
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }

    public static void main(String[] args) {
        //创建线程对象
        TestThread1 thread1 = new TestThread1();
        //调用start方法开启线程
        thread1.start();

        //main线程，主线程
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}
