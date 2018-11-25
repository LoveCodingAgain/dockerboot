package com.lixing.docker.dockerboot.util;
import java.util.Scanner;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/4/6 10:38
 * description：
 */
public class Main {
    public static void main(String[] args) {
       Scanner cin=new Scanner(System.in);
       int[] numbers=new int[3];
       StringBuilder builder=new StringBuilder();
       for(int i=0;i<numbers.length;i++){
           numbers[i]=cin.nextInt();
       }
       for(int i=0;i< numbers.length;i++){
           for(int j=i+1;j<numbers.length;j++){
               int a=Integer.valueOf(numbers[i]+""+numbers[j]);
               int b=Integer.valueOf(numbers[j]+""+numbers[i]);
               if(a>b){
                   int t=numbers[i];
                   numbers[i]=numbers[j];
                   numbers[j]=t;
               }
           }
       }
       for(int i=0;i<numbers.length;i++){
          builder.append(String.valueOf(numbers[i]));
       }
        System.out.println(builder.toString());
    }
}