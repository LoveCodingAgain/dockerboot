package com.lixing.docker.dockerboot.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Future;
/**
 * author: lixing
 * date: 2018-11-25
 * time: 19:27
 * description:异步任务.程序异步同时执行,取时间长度最大的.
 */
@Component
public class AsyncTask {
    @Async
    public Future<Boolean> task1(){
         Instant start=Instant.now();
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         Instant end=Instant.now();
         System.out.println("任务一耗时："+ Duration.between(start,end).toMillis()+"毫秒");
         return new AsyncResult<>(true);
     }

    @Async
    public Future<Boolean> task2(){
        Instant start=Instant.now();
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant end=Instant.now();
        System.out.println("任务二耗时："+ Duration.between(start,end).toMillis()+"毫秒");
        return new AsyncResult<>(true);
    }

    @Async
    public Future<Boolean> task3(){
        Instant start=Instant.now();
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant end=Instant.now();
        System.out.println("任务三耗时："+ Duration.between(start,end).toMillis()+"毫秒");
        return new AsyncResult<>(true);
    }

}
