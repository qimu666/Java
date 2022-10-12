package com.dz.inetAddress.tcpFileCopy;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
    /*
        1.客户端连接到服务端，发送一张图片
        2.客户端接收到服务端发送的"收到图片”，再退出
        3.该程序要求使用StreamUtils.java
     */
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        OutputStream os = socket.getOutputStream();
        String writer = "D:\\JAVA\\io\\必杀技.jpg";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(writer));
        byte[] data = new byte[10];
        int dataLength = 0;
        while ((dataLength = bis.read(data)) != -1) {
            os.write(data, 0, dataLength);
        }
        socket.shutdownOutput();

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
        bis.close();
        socket.close();
    }
}
