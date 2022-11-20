package pers.zh.multithreading.sleep;

/**
 *
 * 线程的休眠
 * 在当前线程的执行过程当中，暂停指定的毫秒数，释放CPU的时间片
 *
 * @author zhanghu
 * @date 2022/11/17 15:03
 */
public class ThreadSleep {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}


//实现线程的第一种方式：继承Thread类
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"-"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//实现线程的第二种方式：实现Runnable接口
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"-"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}