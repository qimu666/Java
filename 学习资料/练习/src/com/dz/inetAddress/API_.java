package com.dz.inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {

    /**
     * InetAddress类的使用
     */
    public static void main(String[] args) throws UnknownHostException {
        //1.获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//LAPTOP-AQKJRAH7/192.168.1.5

        //2.根据主机名获取到InetAddress对象
        InetAddress byName = InetAddress.getByName("LAPTOP-AQKJRAH7");
        System.out.println(byName);//LAPTOP-AQKJRAH7/192.168.1.5

        //3.根据域名获取InetAddress对象
        InetAddress byName1 = InetAddress.getByName("www.baidu.com");
        System.out.println(byName1);//www.baidu.com/39.156.66.18

        //4.通过InetAddress对象获取对应的地址
        String hostName = byName1.getHostAddress();
        System.out.println(hostName);//39.156.66.14

        //5.通过InetAddress对象，获取主机名或者域名
        String hostName1 = byName1.getHostName();
        System.out.println(hostName1);//www.baidu.com

    }
}
