package com.lixing.docker.dockerboot.util;
import java.util.ArrayDeque;
import java.util.Queue;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/3/28 20:12
 * description：两个队列实现一个栈
 */
public class QueueStack {
    private static Queue<Integer> queue1;
    private static Queue<Integer> queue2;

    public static void main(String[] args) {
    queue1=new ArrayDeque<Integer>();
    queue2=new ArrayDeque<Integer>();
    QueueStack.mypush(1);
    QueueStack.mypush(2);
    QueueStack.mypush(3);
    QueueStack.mypush(4);
    QueueStack.mypush(5);
    QueueStack.mypop();
    QueueStack.mypop();
    }
    /** 将数据存入栈里面*/
    public static void mypush(Integer element){
        // 判断两个队列是否为空,优先使用queue1
        if(queue1.isEmpty()&&queue2.isEmpty()){
            queue1.add(element);
        }
        // 如果queue1有数据就直接存放到queue1中
        if(!queue1.isEmpty()){
            queue1.add(element);
        }
        // 如果queue2不为空,queue1为空就存放到queue2.
        if(!queue2.isEmpty()){
            queue2.add(element);
        }
    }
    /** 将数据弹出栈*/
    public static void mypop(){
        if(queue1.isEmpty()&& queue2.isEmpty()){
            try {
                throw new Exception("Stack is null!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // 如果queue1没有元素,就将queue2的元素都添加到queue1去,直到size为1
        if(queue1.isEmpty()){
            while(queue2.size()>1){
                queue1.add(queue2.poll());
            }
            System.out.println(queue2.poll());
        }

        // 如果queue2没有元素,就将queue1的元素都添加到queue2去,直到size为1
        if(queue2.isEmpty()){
            while(queue1.size()>1){
                queue2.add(queue1.poll());
            }
            System.out.println(queue1.poll());
        }
    }

    /**
     * 返回这个的栈
     * @param queue
     */
    public static void mystack(Queue queue){
        int[] a=new int[queue.size()+1];
        while(!queue.isEmpty()){
            for(int i=0;i<a.length;i++){
                a[i]=(int)queue.poll();
            }
        }
        for(int b:a){
            System.out.print(" 【"+b+" 】");
        }
    }
}
