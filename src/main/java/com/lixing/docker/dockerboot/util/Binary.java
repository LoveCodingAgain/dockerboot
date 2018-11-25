package com.lixing.docker.dockerboot.util;

import java.util.Scanner;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/4/6 9:55
 * description：计算十进制正整数在二进制表示中二进制数字个数
 */
public class Binary {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        System.out.println("十进制中二进制的数字有:"+binary(n));
    }

    public static int binary(int n){
        // 至少有一位表示的嘛
        int count=1;
        while(n>1){
            count=count+1;
            n=n/2;
        }
        return count;
    }
}
