package com.lixing.docker.dockerboot.util;
/**
 * title： com.lixing.docker.dockerboot.util
 * @author： lixing
 * date： 2018/4/28 15:54
 * description：
 */
public class IntNode {
    private int data;
    private IntNode link;

    public IntNode(int initdata, IntNode initlink){
        this.data=initdata;
        this.link=initlink;
    }


}
