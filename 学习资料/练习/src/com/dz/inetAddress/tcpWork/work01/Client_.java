package com.dz.inetAddress.tcpWork.work01;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client_ {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.1.7", 9999);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题");
        String next = scanner.next();
        bw.write(next);
        bw.newLine();
        bw.flush();
        socket.shutdownOutput();
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        if (next.equals("1")){
            return;
        }
        br.close();
        bw.close();
        socket.close();
    }
}
