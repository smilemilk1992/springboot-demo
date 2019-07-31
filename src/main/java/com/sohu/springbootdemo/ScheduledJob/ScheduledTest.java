package com.sohu.springbootdemo.ScheduledJob;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 注：需要在主类添加@EnableScheduling，否则不生效
 * @author haochen
 * @date 2019/7/31 16:54
 */
@Component
public class ScheduledTest {

    /**
     * 每三秒执行一次
     * @throws Exception
     */
    @Scheduled(cron = "*/3 * * * * *")
    public void autoShceduledTask() throws Exception{
        System.out.println("Scheduled 定时任务开始执行！！！！！");
    }
}
