package com.lixing.docker.dockerboot.util;
import java.util.Scanner;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/3/26 9:30
 * description：测试尾递归
 */
public class Recursion {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int a=cin.nextInt();
        System.out.println(myrecursion(n,a));
    }
    public static int myrecursion(int n, int a){
        if(n<0){
            return 0;
        }else if(n==0){
            return 1;
        }else if(n==1){
            return a;
        }else{
            return myrecursion(n-1, n*a);
        }
    }
}
