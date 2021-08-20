package org.example.timer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/9
 * @modified by:
 */
public class SchedulePoolTest {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        Task task = new Task();
        scheduledExecutorService.schedule(task,2, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleAtFixedRate(task,2,2,TimeUnit.SECONDS);
    }
}

class Task implements Runnable{

    @Override
    public void run() {
        System.out.println("true = " + true);
    }
}
