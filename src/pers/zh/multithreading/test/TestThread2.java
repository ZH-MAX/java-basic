package pers.zh.multithreading.test;

/**
 *
 * 创建线程方式2：实现Runnable接口，重写run()方法，
 *              执行线程需要丢入Runnable接口实现类，调用start方法开启线程
 *
 * @author zhanghu
 * @date 2022/11/18 16:19
 */
public class TestThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }

    public static void main(String[] args) {
        //创建Runnable接口实现类对象
        TestThread2 myRunnable = new TestThread2();
        //创建线程对象，通过线程对象来开启我们的线程，代理
//        Thread thread = new Thread(myRunnable);
//        thread.start();
        new Thread(myRunnable).start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}
