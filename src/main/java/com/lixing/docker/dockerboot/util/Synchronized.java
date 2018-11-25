package com.lixing.docker.dockerboot.util;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/3/30 20:40
 * description：
 */
public class  Synchronized {
    public static void main(String[] args) {
        synchronized (Synchronized.class){
        }
        m();
    }
    public static synchronized void m(){
    }
}
