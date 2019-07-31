package com.sohu.springbootdemo.QuartzJob;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 项目启动后就开始运行
 * @author haochen
 * @date 2019/7/31 16:47
 */
@Configuration
public class QuartzConfig {
    @Bean
    public JobDetail uploadTaskDetail() {
        return JobBuilder.newJob(MjtTask.class).withIdentity("mjtTask").storeDurably().build();
    }

    @Bean
    public Trigger uploadTaskTrigger() {
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("*/5 * * * * ?");
        return TriggerBuilder.newTrigger().forJob(uploadTaskDetail())
                .withIdentity("mjtTask")
                .withSchedule(scheduleBuilder)
                .build();
    }
}
