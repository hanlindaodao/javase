package com.daodao_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    InetAddress
        此类表示Internet协议（IP）地址

    public static InetAddress getByName(String host)：确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
    public String getHostName()：获取此IP地址的主机名
    public String getHostAddress()：返回文本显示中的IP地址字符串
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {

        //public static InetAddress getByName(String host)：确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
        InetAddress address = InetAddress.getByName("LAPTOP-VAB0R5VL");//DESKTOP-A7IB1T5
//        InetAddress address = InetAddress.getByName("10.175.124.71");
        System.out.println(address);

        //public String getHostName()：获取此IP地址的主机名
        String name = address.getHostName();
        //public String getHostAddress()：返回文本显示中的IP地址字符串
        String ip = address.getHostAddress();

        System.out.println("主机名：" + name);
        System.out.println("IP地址：" + ip);

        System.out.println("My test:");
        // static InetAddress[] getAllByName(String host) 给定主机的名称，根据系统上配置的名称服务返回其IP地址数组。
        InetAddress[] allByName = InetAddress.getAllByName("LAPTOP-VAB0R5VL");
        System.out.println(allByName);
        for (InetAddress i : allByName) {
            System.out.println(i);
        }

        // static InetAddress getByAddress(byte[] addr) 给出原始IP地址的 InetAddress对象。
        byte[] by = new byte[] {(byte)10, (byte)175, (byte)124, (byte)71};
        InetAddress byAddress = InetAddress.getByAddress(by);
        System.out.println(byAddress);
        System.out.println((byte) 10);

//        System.out.println(InetAddress.getByAddress("10.175.124.71".getBytes()));//错的

        // 20211220 证明后边写地址和主机名都行
        InetAddress address3 = InetAddress.getByName("LAPTOP-VAB0R5VL");
        System.out.println(address3);
        InetAddress address2 = InetAddress.getByName("192.168.43.125");
        System.out.println(address2);

        System.out.println("主机名：" + address.getHostName());
        System.out.println("IP地址：" + address.getHostAddress());

        System.out.println("主机名：" + address2.getHostName());
        System.out.println("IP地址：" + address2.getHostAddress());
    }
}
