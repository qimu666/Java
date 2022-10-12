package com.dz.inetAddress;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCPServer {
    /**
     * 服务端   字节流
     */
    @Test
    public void byteStream() throws IOException {
        //创建服务端
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端正在监听9999端口>>>>>>>");
        //没有连接成功,则堵塞监听9999端口
        //如果连接成功 ,返回socket对象
        Socket socket = serverSocket.accept();
        System.out.println("连接成功" + socket.getClass());
        //服务端回复消息
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好，柒木".getBytes());
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        byte[] data = new byte[1024];
        int dataLength = 0;
        while ((dataLength = inputStream.read(data)) != -1) {
            System.out.println(new String(data, 0, dataLength));
        }
        //关闭所有流
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出");
    }

    /**
     * 服务端   字符流
     */
    @Test
    public void characterStream() throws IOException {
        //创建服务端
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端正在监听9999端口>>>>>>>");
        //没有连接成功,则堵塞监听9999端口
        //如果连接成功 ,返回socket对象
        Socket socket = serverSocket.accept();
        System.out.println("连接成功" + socket.getClass());
        //服务端回复消息
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
//        byte[] data = new byte[1024];
//        int dataLength = 0;
//        while ((dataLength = inputStream.read(data)) != -1) {
//            System.out.println(new String(data, 0, dataLength));
//        }
        //关闭所有流
        br.close();
        bw.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出");
    }
}
