package com.lixing.docker.dockerboot.controller;

import com.lixing.docker.dockerboot.task.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Future;

/**
 * author: lixing
 * date: 2018-11-25
 * time: 19:34
 * description:测试异步任务执行
 */
@RestController
@RequestMapping("/task")
public class AsyncTaskController {
    @Autowired
    private AsyncTask asyncTask;

    @RequestMapping("/async")
    public String task() {
        Instant start = Instant.now();
        Future<Boolean> task1 = asyncTask.task1();
        Future<Boolean> task2 = asyncTask.task2();
        Future<Boolean> task3 = asyncTask.task3();
        while (!task1.isDone() || !task2.isDone() || !task3.isDone()) {
            if (task1.isDone() && task2.isDone() && task3.isDone()) {
                break;
            }
        }
        Instant end = Instant.now();
        String times = "异步任务耗时为:" + Duration.between(start, end).toMillis() + "毫秒";
        System.out.println(times);
        return times;

    }
}
