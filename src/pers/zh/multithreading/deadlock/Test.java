package pers.zh.multithreading.deadlock;

/**
 * @author zhanghu
 * @date 2022/11/18 9:10
 */
public class Test {
    public static void main(String[] args) {

        String lock1 = "";
        String lock2 = "7902";

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("t1获取lock1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                synchronized (lock2){
                    System.out.println();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2){
                    System.out.println("t2获取lock2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (lock1){
                        System.out.println("t2获取lock2");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println();
            }
        });

        t1.start();
        t2.start();
    }
}
