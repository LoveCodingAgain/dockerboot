package com.lixing.docker.dockerboot.util;
import java.util.HashSet;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/4/6 11:05
 * description：HashSet
 */
public class NewHashSet {
    public static void main(String[] args)
    {
        HashSet hashSet = new HashSet();
        hashSet.add(new Persion("zhangran"));
        hashSet.add(new Persion("zhangran"));
        System.out.println(hashSet.toString());
        System.out.println("以上为第一部分----------------");
        Persion p1=new Persion("zhangran");
        hashSet.add(p1);
        hashSet.add(p1);
        System.out.println(hashSet.toString());
        System.out.println("下面来的为第三部分------------");
        String s1 = new String("aa");
        String s2 = new String("aa");
        hashSet.add(s1);
        hashSet.add(s2);
        System.out.println(hashSet.toString());

    }
}
class Persion {
    String name;

    Persion(String name) {
        this.name = name;
    }
}

