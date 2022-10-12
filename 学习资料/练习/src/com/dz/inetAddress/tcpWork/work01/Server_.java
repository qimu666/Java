package com.dz.inetAddress.tcpWork.work01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_ {
    public static void main(String[] args) throws IOException {
      /*(1)使用字符流的方式，编写一个客户端程序和服务器端程序，
        (2)客户端发送"name”,服务器端接收到后，返回"我是nova",nova是你自己的名字
        (3)客户端发送"hobby",服务器端接收到后，返回"编写java程序”
        (4)不是这两个问题，回复"你说啥呢''
       */
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端9999监听中");
        Socket accept = serverSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        String s = br.readLine();
        if (s.equals("1")) {
            System.out.println("用户已退出");
            bw.newLine();
        }
        if ("name".equals(s)) {
            System.out.println(s);
            bw.write("我是柒木");
//                bw.newLine();
//                bw.flush();
        } else if ("hobby".equals(s)) {
            System.out.println(s);
            bw.write("编写java程序");
//            bw.newLine();
//                bw.flush();
        } else {
            bw.write("你说啥子");
//            bw.newLine();
//                bw.flush();

        }
        bw.flush();
        bw.close();
        br.close();
        serverSocket.close();
    }
}
