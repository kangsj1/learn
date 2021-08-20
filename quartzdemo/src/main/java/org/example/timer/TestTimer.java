package org.example.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/4
 * @modified by:
 */
public class TestTimer {
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args) {
        Timer timer = new Timer();
        System.out.println("start test timer");
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("1111This is timerTask impl execution once");
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                countDownLatch.countDown();
            }
        };

        TimerTask task2 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("2222This is timerTask2 impl execution once");
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                countDownLatch.countDown();
            }
        };

        //3s后执行
//        timer.schedule(task,3*1000);
        //指定时间执行
//        timer.schedule(task,new Date(new Date().getTime() + 3*1000));
        //3s后执行，每隔1s执行
        timer.schedule(task,3*1000,1000);
        //schedule和scheduleAtFixedRate的区别在于，如果指定开始执行的时间在当前系统运行时间之前，scheduleAtFixedRate会把已经过去的时间也作为周期执行，
        // 而schedule不会把过去的时间算上。
        timer.scheduleAtFixedRate(task2,3000,1000);
//        try {
//            countDownLatch.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        timer.cancel();

    }
}
