package com.lixing.docker.dockerboot.util;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/3/26 11:39
 * description：读写锁
 */
public class Service {
    private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
    /** 读锁*/
    public void read(){
        lock.readLock().lock();
        System.out.println("获取读锁:"+Thread.currentThread().getName()+"  "+System.currentTimeMillis());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.readLock().unlock();
        }
    }
    /** 写锁*/
    public void write(){
        lock.writeLock().lock();
        System.out.println("获取读锁:"+Thread.currentThread().getName()+"  "+System.currentTimeMillis());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.writeLock().unlock();
        }
    }
}
