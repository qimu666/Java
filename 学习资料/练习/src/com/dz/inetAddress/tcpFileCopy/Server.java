package com.dz.inetAddress.tcpFileCopy;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    // 1.编写一个服务端，和一个客户端
    // 2.服务器端在8888端口监听
    // 3.服务器端接收到客户端发送的图片，保存到目录下，发送"收到图片"再退出
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端正在监听8888端口>>>>>>");
        Socket accept = serverSocket.accept();
        InputStream is = accept.getInputStream();
        String writer = "D:\\JAVA\\io\\TCP.jpg";
        BufferedWriter bufferedWriter =
                new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(writer));
        byte[] data = new byte[10];
        int dataLength = 0;
        while ((dataLength = is.read(data)) != -1) {
            bos.write(data, 0, dataLength);
            bos.flush();
        }
//        bufferedWriter.write("收到图片");
//        bufferedWriter.newLine();
//        bufferedWriter.write("收到图片2");
//        bufferedWriter.newLine();
//        bufferedWriter.flush();

        bos.close();
        bufferedWriter.close();
        is.close();
        accept.close();
        serverSocket.close();
    }
}
