package org.example.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.listeners.JobListenerSupport;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/14
 * @modified by:
 */
public class MyJobListener extends JobListenerSupport {
    @Override
    public String getName() {
        return "myJobListener";
    }

    @Override
    public void jobToBeExecuted(JobExecutionContext context) {
        System.out.println("执行前-------------------");
        super.jobToBeExecuted(context);
    }

    @Override
    public void jobExecutionVetoed(JobExecutionContext context) {
        System.out.println("执行失败-------------------");
        super.jobExecutionVetoed(context);
    }

    @Override
    public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
        System.out.println("执行后-------------------");
        super.jobWasExecuted(context, jobException);
    }
}
