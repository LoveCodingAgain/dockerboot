package com.lixing.docker.dockerboot.util;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/4/3 20:20
 * description：实现一个类如果需要比较大小,就要实现Comparable接口,泛型参数T,比较谁就写谁的类型.
 */
public class Domain implements Comparable<Domain> {
    private String string;

    public Domain(String string){
        this.string=string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public int compareTo(Domain o) {
        if(this.string.compareTo(o.getString())>0){
            return 1;
        }else if(this.string.compareTo(o.getString())==0){
            return 0;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Domain d1 = new Domain("c");
        Domain d2 = new Domain("c");
        Domain d3 = new Domain("b");
        Domain d4 = new Domain("d");
        System.out.println(d1.compareTo(d1));
        System.out.println(d2.compareTo(d3));
        System.out.println(d1.compareTo(d4));
    }
}
