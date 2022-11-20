package pers.zh.multithreading.test;

/**
 * join方法：
 * 加入线程，让调用的线程先执行指定时间或执行完毕
 *
 * @author zhanghu
 * @date 2022/11/17 16:35
 */
public class ThreadJoin {
    public static void main(String[] args) {

        MyRunnable2 myRunnable2 = new MyRunnable2();
        Thread thread = new Thread(myRunnable2);
        thread.start();

        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i==20){
//                try {
//                    thread.join();//让thread这个线程执行完毕再执行主线程
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                thread.interrupt();//中断线程 //java.lang.InterruptedException: sleep interrupted //只是做了中断标记
            }
        }
    }
}

class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (Thread.interrupted()){//测试中断状态，此方法会把中断状态清除
                break;
            }
            System.out.println(Thread.currentThread().getName()+"--"+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}
