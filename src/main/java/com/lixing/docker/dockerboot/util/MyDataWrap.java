package com.lixing.docker.dockerboot.util;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/4/3 22:43
 * description：一个可以比较类对象的引用数组
 */
public class MyDataWrap implements Comparable<MyDataWrap>{
    private int data;
    private String flag;

    public MyDataWrap(int data, String flag){
        this.data=data;
        this.flag=flag;
    }

    @Override
    public String toString(){
        return data+flag;
    }

    @Override
    public int compareTo(MyDataWrap o) {
        return this.data>o.data?1:(this.data==o.data?0:-1);
    }
}
