package org.example.quartz;

import org.quartz.*;

import javax.lang.model.SourceVersion;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/5
 * @modified by:
 */
@DisallowConcurrentExecution//将该注解加到job类上，告诉Quartz不要并发地执行同一个job定义（这里指特定的job类）的多个实例
@PersistJobDataAfterExecution//将该注解加在job类上，告诉Quartz在成功执行了job类的execute方法后（没有发生任何异常），更新JobDetail中JobDataMap的数据，使得该job（即JobDetail）在下一次执行的时候，JobDataMap中是更新后的数据，而不是更新前的旧数据。
public class PrintWordsJob implements Job {

    private String c1;
    private String job1;
    private String job2;
    private String trigger1;
    private String trigger2;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("c1 + job1  = " + c1 + job1 + job2 + trigger1 +trigger2);
        try {
            Object c1 = context.getScheduler().getContext().get("c1");
            System.out.println("c1 = " + c1);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        Object c1 = context.get("c1");
        Object job11 = context.get("job1");
//        System.out.println("job11 = " + job11);
//        System.out.println("c1 = " + c1);
        Object job1 = context.getJobDetail().getJobDataMap().get("job1");
//        System.out.println("job1 = " + job1);
        Object job2 = context.getJobDetail().getJobDataMap().get("job2");
//        System.out.println("job2 = " + job2);
        Object trigger1 = context.getTrigger().getJobDataMap().get("trigger1");
//        System.out.println("trigger1 = " + trigger1);
        Object trigger2 = context.getTrigger().getJobDataMap().get("trigger2");
//        System.out.println("trigger2 = " + trigger2);

        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)+"jobExecutionContext = " + context);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)= " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public void setJob1(String job1) {
        this.job1 = job1;
    }

    public void setJob2(String job2) {
        this.job2 = job2;
    }

    public void setTrigger1(String trigger1) {
        this.trigger1 = trigger1;
    }

    public void setTrigger2(String trigger2) {
        this.trigger2 = trigger2;
    }
}
