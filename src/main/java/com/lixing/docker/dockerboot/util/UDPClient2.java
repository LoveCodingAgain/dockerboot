package com.lixing.docker.dockerboot.util;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/3/15 11:11
 * description：
 */
public class UDPClient2 {
    public static void main(String[] args) throws IOException {
        Scanner cin=new Scanner(System.in);
        // 创建Socket连接,这里指定特定的端口,可以是随机的端口.
        DatagramSocket socket=new DatagramSocket(10002);
        while(true){
            String line=cin.nextLine();
            if("exit".equalsIgnoreCase(line)){
                System.out.println("您已离开聊天室,下次再见啦!");
                break;
            }else{
                // 建立数据报
                DatagramPacket packet=new DatagramPacket(line.getBytes(),line.getBytes().length, InetAddress.getByName("127.0.0.1"),10003);
                // 发送数据
                socket.send(packet);
            }
        }
        // 关闭连接
        socket.close();
    }
}
