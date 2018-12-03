package com.lixing.docker.dockerboot.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * author: lixing
 * date: 2018-11-25
 * time: 19:58
 * description:实现指定时间间隔报告当前时间
 */
@Component
public class SchedulingTask {
    private static SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 每三秒报告一次时间
     */
    @Scheduled(cron = "3-30 * * * * ?")
    public void reportCurrentTime() {
        System.out.println("当前时间是：" + sdformat.format(new Date()));
    }
}
