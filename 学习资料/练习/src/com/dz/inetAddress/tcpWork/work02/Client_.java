package com.dz.inetAddress.tcpWork.work02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client_ {
    public static void main(String[] args) throws IOException {
    /*  (1) 编写客户端程序和服务器端程序
        (2) 客户端可以输入一个音乐文件名，比如高山流水，服务端收到音乐名后，可以给
        客户端返回这个音乐文件，如果服务器没有这个文件，返回一个默认的音乐即可.
        (3) 客户端收到文件后，保存到本地
     */
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        OutputStream outputStream = socket.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入作品名");
        String next = scanner.next();
        outputStream.write(next.getBytes());
        socket.shutdownOutput();
        String MP3 = "D:\\JAVA\\io\\Copy我的歌声里.jpg";
        InputStream inputStream = socket.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(inputStream);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();//创建输出流对象
        byte[] data = new byte[1024];
        int dadaLength;
        while ((dadaLength = bis.read(data)) != -1) {
            bos.write(data, 0, dadaLength);
        }
        byte[] a = bos.toByteArray();//将bos,转为字节数组
        bos.close();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(MP3));
        bufferedOutputStream.write(a);
        bufferedOutputStream.close();
        bis.close();
        outputStream.close();
        socket.close();
    }
}
