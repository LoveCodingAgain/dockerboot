package com.lixing.docker.dockerboot.util;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
/**
 * title： com.lx.docker.dockerboot.util
 * @author： lixing
 * date： 2018/3/15 10:36
 * description：UDP的服务端接受数据，注意getPort是客户端发送过来数据的端口.
 */
public class UDPServer {
    public static void main(String[] args) throws IOException {
        Scanner cin=new Scanner(System.in);
        // 建立Socket连接,监听是否有客户端连接.
        DatagramSocket socket=new DatagramSocket(9991);
        // 建立Packet连接
        DatagramPacket packet=new DatagramPacket(new byte[1024],1024);
        // 获取客户端的通信地址
        InetAddress clientAddress = packet.getAddress();
        // 获取客户端的端口
        int port=packet.getPort();
        while(true) {
            // 接受客户端发送的数据
            socket.receive(packet);
            // 获取数据
            byte[] arr = packet.getData();
            // 获取数据的长度
            int len = packet.getLength();
            // 输出数据
            System.out.println("发送方:" + packet.getAddress() + ":" + packet.getPort() + ": " + new String(arr, 0, len));
            // 返回给服务端发送的数据
            String serverline=cin.nextLine();
            DatagramPacket serevrpacket=new DatagramPacket(serverline.getBytes(),serverline.getBytes().length,clientAddress,port);
            socket.send(serevrpacket);
        }
        // 关闭连接,持续连接发送数据.
    }
}
