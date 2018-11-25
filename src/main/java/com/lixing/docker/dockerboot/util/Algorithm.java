package com.lixing.docker.dockerboot.util;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/3/21 10:42
 * description：算法案例
 */
public class Algorithm {
    public static void main(String[] args) {
        String str = "abcXYZdef";
        System.out.println(LeftRotateString(str,9));
    }
    public static String LeftRotateString(String str, int n) {
        int len=str.length();
        if(len==0||n<0||n>len){
            return "";
        }
        str+=str;
        return str.substring(n,len+n);
    }
}
