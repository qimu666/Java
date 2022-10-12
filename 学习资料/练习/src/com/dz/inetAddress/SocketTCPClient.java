package com.dz.inetAddress;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCPClient {
    /**
     * 客户端 字节流
     */
    @Test
    public void byteStream() throws IOException {
        //连接服务器(ip,端口)
        //如果连接成功 ,返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("连接成功");
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("柒木".getBytes());
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        byte[] data = new byte[1024];
        int dataLength = 0;
        while ((dataLength = inputStream.read(data)) != -1) {
            System.out.println(new String(data, 0, dataLength));
        }
        //关闭所有流
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端退出");
    }

    /**
     * 客户端 字符流
     */
    @Test
    public void characterStream() throws IOException {
        //连接服务器(ip,端口)
        //如果连接成功 ,返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("连接成功");
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));//转为字符流
        bw.write("你好，柒木");
        bw.newLine();//插入一个newLine()换行符，表示写入内容结束，必须要求对方用readLine读取()！！！
        bw.flush();//！！！需要flush()手动刷新方法
//        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        //1.
        String s = br.readLine();
        System.out.println(s);
        //2.
//        String line;
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }
        //关闭所有流
        br.close();
        bw.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
