package pers.zh.multithreading.test;

/**
 *
 * 初识并发
 *
 * 多个线程操作同一个资源的情况下，线程不安全，数据紊乱。
 *
 * @author zhanghu
 * @date 2022/11/18 16:49
 */
public class TestThread3 implements Runnable{

    //票数
    private int ticketNums = 10;

    @Override
    public void run() {
        while (true){
            if (ticketNums <= 0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"--->拿到了第"+ticketNums--+"张票");
        }
    }

    public static void main(String[] args) {
        TestThread3 myRunnable = new TestThread3();

        new Thread(myRunnable,"1").start();
        new Thread(myRunnable,"2").start();
        new Thread(myRunnable,"3").start();
    }
}


/*
1--->拿到了第9张票
1--->拿到了第7张票
3--->拿到了第10张票
3--->拿到了第6张票
3--->拿到了第5张票
2--->拿到了第8张票
2--->拿到了第2张票
2--->拿到了第1张票
3--->拿到了第3张票
1--->拿到了第4张票
*/
