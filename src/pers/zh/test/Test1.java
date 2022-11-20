package pers.zh.test;

/**
 * @author zhanghu
 * @date 2022/11/18 8:35
 */
public class Test1 {
    public static void main(String[] args) {
        String lock="a";
        for (int i = 0; i < 5; i++) {
            final int x=i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (lock){
                        try {
                            lock.notify();
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("A");
                        try {
                            lock.wait();
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (lock){
                        try {
                            lock.notify();
                            Thread.sleep(1000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        System.out.println("B");

                        try {
                            lock.wait();
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
    }
}