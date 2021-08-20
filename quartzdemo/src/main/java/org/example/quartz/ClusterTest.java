package org.example.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/16
 * @modified by:
 */
public class ClusterTest {
    public static void main(String[] args) throws SchedulerException {
        // Grab the Scheduler instance from the Factory
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        scheduler.getContext().put("c1","stext");
        // and start it off
        scheduler.start();

//            scheduler.shutdown();
    }
}
