package com.wang.spring.job;

import org.quartz.*;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.SimpleTriggerImpl;
import org.quartz.utils.Key;

import java.util.Date;

/**
 * Created by wang on 2018/1/19.
 */
public class SimpleTriggerRunner {
    public static void main(String[] args) {
        JobDetailImpl jobDetail=new JobDetailImpl();
        jobDetail.setJobClass(SimpleJob.class);
        jobDetail.setKey(new JobKey(Key.createUniqueName("group1")));
        SimpleTriggerImpl simpleTrigger=new SimpleTriggerImpl();
        simpleTrigger.setStartTime(new Date());
        simpleTrigger.setRepeatInterval(2000);
        simpleTrigger.setRepeatCount(5);
        simpleTrigger.setName("trigger1");
        SchedulerFactory schedulerFactory=new StdSchedulerFactory();
        try {
            Scheduler scheduler=schedulerFactory.getScheduler();
            scheduler.scheduleJob(jobDetail,simpleTrigger);
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }

    }
}
