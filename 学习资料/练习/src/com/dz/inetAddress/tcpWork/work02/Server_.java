package com.dz.inetAddress.tcpWork.work02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_ {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端监听中");
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] name = new byte[1024];
        int nameLength = 0;
        String getName = "";
        while ((nameLength = inputStream.read(name)) != -1) {
            getName += new String(name, 0, nameLength);
        }
        String fileName = "";
        if ("我的歌声里".equals(getName)) {
            fileName = "D:\\JAVA\\io\\我的歌声里.wav";
        } else {
            fileName = "D:\\JAVA\\io\\TCP.jpg";
        }
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));
//        OutputStream outputStream = accept.getOutputStream();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] data = new byte[1024];
        int dadaLength;
        while ((dadaLength = bis.read(data)) != -1) {
            bos.write(data, 0, dadaLength);
//            accept.shutdownOutput();
        }
        byte[] a = bos.toByteArray();
        bos.close();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(accept.getOutputStream());
        bufferedOutputStream.write(a);

        bufferedOutputStream.close();
        bis.close();
        inputStream.close();
        accept.close();
        serverSocket.close();

//        InputStream inputStream = accept.getInputStream();
//        OutputStream outputStream = accept.getOutputStream();
//        byte[] data = new byte[1024];
//        int dadaLength = 0;
//        String downLoad = "";
//        while ((dadaLength = inputStream.read(data)) != -1) {
//            downLoad += new String(data, 0, dadaLength);
//        }
//        String MP4 = "";
//        if ("一直很安静".equals(downLoad)) {
//            MP4 = "D:\\JAVA\\io\\TCP.jpg";
//        } else {
//            outputStream.write("歌曲不存在".getBytes());
//            accept.shutdownOutput();
//        }
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(MP4));
//        byte[] data1 = new byte[1024];
//        int dadaLength1 = 0;
//        while ((dadaLength1 = bis.read(data)) != -1) {
//            outputStream.write(data1, 0, dadaLength1);
//        }
//        accept.shutdownOutput();
//        System.out.println("发送成功");
//        bis.close();
//        outputStream.close();
//        inputStream.close();
//        accept.close();
//        serverSocket.close();
    }
}
