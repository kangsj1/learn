package org.example.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/14
 * @modified by:
 */
public class QuartzTest {
    public static void main(String[] args) {
        try {
            // Grab the Scheduler instance from the Factory
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.getContext().put("c1","stext");
            // and start it off
            scheduler.start();
            // define the job and tie it to our HelloJob class
            JobDetail job = JobBuilder.newJob(PrintWordsJob.class)
                    .withIdentity("job1", "group1")
                    .usingJobData("job1","jobtest")
                    .build();
            job.getJobDataMap().put("job2","job2");

            // Trigger the job to run now, and then repeat every 40 seconds
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("trigger1", "group1")
                    .usingJobData("trigger1","trigger1text")
                    .startNow()
                    .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                            .withIntervalInSeconds(30)
                            .repeatForever())
                    .build();
            trigger.getJobDataMap().put("trigger2","trigger2");

            //add listener
//            scheduler.getListenerManager().addJobListener(new MyJobListener());
            scheduler.getListenerManager().addTriggerListener(new MyTriggerListener());

            // Tell quartz to schedule the job using our trigger
            scheduler.scheduleJob(job, trigger);


//            scheduler.shutdown();


        } catch (SchedulerException se) {
            se.printStackTrace();
        }
    }
}
