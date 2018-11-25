package com.lixing.docker.dockerboot.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/4/6 13:34
 * description：测试约瑟夫环
 */
public class YueSefu {
    public static void main(String[] args) {
        List list1=new ArrayList();
        List list2=new ArrayList();
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入约瑟夫环的总人数:");
        int n=cin.nextInt();
        System.out.println("输入约瑟夫环的出圈人数:");
        int m=cin.nextInt();
        System.out.println("按照游戏规则的出圈数:");
        // 首先将所以人添加到List里面
        for(int i=0;i<n;i++){
            list1.add(i+1);
        }
        // 约瑟夫环中的序号
        int i=-1;
        // 计数号
        int countX=0;
        while(list1.size()>0){
             ++i;
             // 如果已经是环的最后一个元素了,要从头开始嘛.
             if(i==list1.size()){
                 i=0;
             }
            ++countX;
             if(countX==m){
                 System.out.print(list1.get(i)+" ");
                 list2.add(list1.get(i));
                 list1.remove(i);
                 countX=0;
                 i--;
             }
        }
        // 获取最后一个出环的人
        System.out.println(list2.get(list2.size()-1));
    }
}
