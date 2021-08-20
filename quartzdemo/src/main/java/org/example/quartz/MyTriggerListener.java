package org.example.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.Trigger;
import org.quartz.listeners.TriggerListenerSupport;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/14
 * @modified by:
 */
public class MyTriggerListener extends TriggerListenerSupport {
    @Override
    public String getName() {
        return "myTriggerListener";
    }

    @Override
    public void triggerFired(Trigger trigger, JobExecutionContext context) {
        System.out.println("trigger执行触发前-------------------");
        super.triggerFired(trigger, context);
    }

    @Override
    public boolean vetoJobExecution(Trigger trigger, JobExecutionContext context) {
        System.out.println("trigger执行-------------------");
        return super.vetoJobExecution(trigger, context);
    }

    @Override
    public void triggerMisfired(Trigger trigger) {
        System.out.println("trigger执行丢失-------------------");
        super.triggerMisfired(trigger);
    }

    @Override
    public void triggerComplete(Trigger trigger, JobExecutionContext context, Trigger.CompletedExecutionInstruction triggerInstructionCode) {
        System.out.println("trigger执行完成-------------------");
        super.triggerComplete(trigger, context, triggerInstructionCode);
    }
}
