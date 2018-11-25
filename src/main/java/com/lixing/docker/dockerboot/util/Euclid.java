package com.lixing.docker.dockerboot.util;
import java.util.Scanner;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/4/6 9:45
 * description：gcd算法计算最大公约数和最小公倍数
 */
public class Euclid {
    public static void main(String[] args) {
        Scanner  cin=new Scanner(System.in);
        int m=cin.nextInt();
        int n=cin.nextInt();
        System.out.println("最大公约数:"+euclid(m, n));
        System.out.println("最大小公倍数:"+muclid(m, n));
    }

    public static int euclid(int m, int n){
        while(n!=0){
            int r=m%n;
            m=n;
            n=r;
        }
        return m;
    }

    public static int muclid(int m, int n){
        int mod=euclid(m,n);
        return (m*n)/mod;
    }

}
