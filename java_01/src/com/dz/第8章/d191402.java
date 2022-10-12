package com.dz.第8章;

import java.util.Scanner;

public class d191402 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        d191401 xinxi=new d191401();
        xinxi.showLoginMenu();
        System.out.println("请选择，输入数字：");
        xinxi.xz=scanner.nextInt();
        do {
//            System.out.println("请选择，输入数字：");
            switch (xinxi.xz){
                case 1:
                    xinxi.showMainMenu();
//                    xinxi.xz1=scanner.nextInt();
                    switch (xinxi.xz1){
                        case 1:
                            xinxi.showCustMenu();
                            switch (xinxi.xz2){
                                case 0:
                                    xinxi.showLoginMenu();
                                    break;
                                case 1:
                                    System.out.println("显示所有客户信息");
                                    break;
                                case 2:
                                    System.out.println("添加客户信息");
                                    break;
                                case 3:
                                    System.out.println("修改客户信息");
                                    break;
                                case 4:
                                    System.out.println("查看客户信息");
                                    break;
                            }
//

                            break;

                        case 2:
                            xinxi.showSendGMenu();
                            break;

                   }
                case 2:

                    System.out.println("退出成功");
                 return;
                default:
                    System.out.println("输入有误");
            }

        }while (true);
    }
}
