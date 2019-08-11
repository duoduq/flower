package com.duoduq.flower.common;

import com.duoduq.flower.utils.DateUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @Auther: Jack
 * @Date: 2019-07-31 09:38
 * @Description:
 */
@Component
public class SchedulerTask {

    @Scheduled(cron = "*/6 * * * * ?")
    private void task() {
        String s = DateUtil.getAllFormatterLocalDateTime(LocalDateTime.now());
        System.out.println(s + "定时任务。。。");
    }
}
