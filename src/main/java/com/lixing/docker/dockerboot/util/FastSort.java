package com.lixing.docker.dockerboot.util;

import java.util.Arrays;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/4/3 22:46
 * description：
 */
public class FastSort {
    public static void main(String[] args) {
      MyDataWrap[] data={
              new MyDataWrap(9,""),
              new MyDataWrap(-16,""),
              new MyDataWrap(21,"*"),
              new MyDataWrap(23,""),
              new MyDataWrap(-30,""),
              new MyDataWrap(-49,""),
              new MyDataWrap(21,""),
              new MyDataWrap(30,"*"),
              new MyDataWrap(13,"*"),
      };
        System.out.println("排序之前:"+ Arrays.toString(data));
        quickSort(data);
        System.out.println("排序之后:"+Arrays.toString(data));
    }

    /**
     * 将数组中指定位置的i和j进行交换
     * @param data
     * @param i
     * @param j
     */
    public static void swap(MyDataWrap[] data, int i ,int j){
        MyDataWrap temp;
        temp=data[i];
        data[i]=data[j];
        data[j]=temp;
    }

    /**实现子排序
     * @param data
     * @param start
     * @param end
     */
    private static void subSort(MyDataWrap[] data, int start, int end){
        if(start<end){
            MyDataWrap base=data[start];
            // i从左面开始检索,搜索大于分界值的索引值
            int i=start;
            // j从右面开始检索,检索小于分界值的索引值
            int j=end+1;
            while(i!=j) {
                while(i < end && data[++i].compareTo(base) <= 0) {}
                while(j > start && data[--j].compareTo(base) >= 0){}
                if (i < j) {
                    swap(data, i, j);
                } else {
                    break;
                }
            }
                swap(data,start,j);
                subSort(data, start, j-1);
                subSort(data,j+1, end);
            }
        }
        public static void quickSort(MyDataWrap[] data){
        subSort(data,0, data.length-1);
    }
}
