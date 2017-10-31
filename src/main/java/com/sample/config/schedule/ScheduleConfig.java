package com.sample.config.schedule;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import static java.util.concurrent.Executors.newScheduledThreadPool;

/**
 * Created by zhenghuasheng on 2017/9/14.16:45
 */
//所有的定时任务都放在一个线程池中，定时任务启动时使用不同都线程。
@Configuration
public class ScheduleConfig implements SchedulingConfigurer {

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        //设定一个长度10的定时任务线程池
        taskRegistrar.setScheduler(newScheduledThreadPool(10));
    }
}