package com.lixing.docker.dockerboot.util;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/4/6 11:43
 * description：测试相同的String的hashcode
 */
public class TestString {
    public static void main(String[] args) {
        String str1=new String("String1");
        String str2=new String("String1");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
