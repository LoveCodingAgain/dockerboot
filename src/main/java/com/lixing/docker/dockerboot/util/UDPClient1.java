package com.lixing.docker.dockerboot.util;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/3/15 10:05
 * description：UDP数据发送数据,模拟聊天软件
 */
public class UDPClient1 {
    public static void main(String[] args) throws IOException {
        Scanner cin=new Scanner(System.in);
        // 创建Socket连接,这里指定特定的端口,可以是随机的端口.
        DatagramSocket socket=new DatagramSocket(9990);
        while(true){
            String line=cin.nextLine();
            if("exit".equalsIgnoreCase(line)){
                System.out.println("您已离开聊天室,下次再见啦!");
                break;
            }else{
                // 建立数据报
                DatagramPacket packet=new DatagramPacket(line.getBytes(),line.getBytes().length,InetAddress.getByName("127.0.0.1"),9991);
                // 发送数据
                socket.send(packet);
                // 接受服务端的数据
                DatagramPacket clientpacket=new DatagramPacket(new byte[1024],1024);
                socket.receive(clientpacket);
                // 获取数据
                byte[] arr = clientpacket.getData();
                // 获取数据的长度
                int len = clientpacket.getLength();
                System.out.println("服务端:" + clientpacket.getAddress() + ":" + clientpacket.getPort() + ": " + new String(arr, 0, len));
            }
        }
        // 关闭连接
        socket.close();
    }
}
