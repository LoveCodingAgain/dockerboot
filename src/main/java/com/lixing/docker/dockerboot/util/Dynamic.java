package com.lixing.docker.dockerboot.util;
import java.util.Scanner;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/3/26 9:48
 * description：动态规划
 */
public class Dynamic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dp = new int[n + 1];
        int[] readArr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            for (int k = 1; k < n + 1; k++) {
                readArr[k] = in.nextInt();
            }
            for (int j = 1; j < n + 1; j++) {
                dp[j] = Math.max(dp[j],dp[j-1])+readArr[j];
            }
        }
        System.out.println(dp[n]);
    }
}
