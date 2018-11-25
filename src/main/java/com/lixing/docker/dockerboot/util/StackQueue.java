package com.lixing.docker.dockerboot.util;
import java.util.Stack;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/3/28 19:20
 * description：两个队列实现栈的算法实现
 */
public class StackQueue {
    private static Stack<Integer> stack1;
    private static Stack<Integer> stack2;
    public static void main(String[] args) {
     stack1=new Stack();
     stack2=new Stack();
     StackQueue.mypush(1);
     StackQueue.mypush(2);
     StackQueue.mypush(3);
     StackQueue.mypush(4);
     System.out.println(StackQueue.mypop());
     System.out.println();
     StackQueue.myqueue(stack2);
    }
    /** 进队列的方法*/
    public  static void mypush(Integer node){
         stack1.push(node);
    }
    /** 出队列的方法,返回队列的*/
    public static int mypop(){
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
    /** 返回整个对列*/
    public static void myqueue(Stack stack){
        int[] a=new int[stack.size()];

        while(!stack.empty()){
            for(int i=0;i<a.length;i++){
                a[i]=(int)stack.pop();
            }
        }
        for(int b:a){
            System.out.println(b);
        }
    }
}