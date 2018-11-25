package com.lixing.docker.dockerboot.util;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/3/26 11:20
 * description：基于Lock的等待通知机制
 */
public class MyService {
    private ReentrantLock lock=new ReentrantLock();
    private Condition conditionA=lock.newCondition();
    private Condition conditionB=lock.newCondition();
    /** 等待方法A**/
    public void waitMethodA(){
        lock.lock();
        System.out.println("获取了锁!");
        System.out.println("Begin awaitA的时间:"+System.currentTimeMillis()+" "+Thread.currentThread().getName());
        try {
            conditionA.await();
            System.out.println("End awaitA时间为"+System.currentTimeMillis()+" "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println("锁被释放了!");
        }
    }
    /** 等待方法B**/
    public void waitMethodB(){
        lock.lock();
        System.out.println("获取了锁!");
        System.out.println("Begin awaitB的时间:"+System.currentTimeMillis()+" "+Thread.currentThread().getName());
        try {
            conditionB.await();
            System.out.println("End awaitB时间为"+System.currentTimeMillis()+" "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println("锁被释放了!");
        }
    }
    /** 通知方法*/
    public void signalAllA(){
        lock.lock();
        try {
            System.out.println("signal的时间为:" + System.currentTimeMillis() + " " + Thread.currentThread().getName());
            conditionA.signalAll();
        }finally{
            lock.unlock();
        }
    }
}
