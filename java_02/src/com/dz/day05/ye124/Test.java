package com.dz.day05.ye124;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Scanner scanner = new Scanner(System.in);
        System.out.println("忙");
         hero.setName(scanner.next());
         String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
         String sr="";
        Random random = new Random();
        for (int i = 1; i <= 6; i++) {

            int random1 = random.nextInt(str.length());
            char c =str.charAt(random1);
            sr=sr+c;
        }
        System.out.println(sr);
        long startTime= hero.getStartTime();
        startTime=System.currentTimeMillis();
        String kaishi=scanner.next();
        long jieshu=System.currentTimeMillis();
        long yongshi=hero.getStartTime();
        yongshi=jieshu-startTime;
//        if (kaishi.equals(sr)&&yongshi<10000){
//            System.out.println("����ָ����ȷ��Ӣ��"+hero.getName()+"���ڵļ�����1�����÷�-3--��ʱ"+(yongshi/1000)+"��");
//        }
        if (kaishi.equals(sr)){
            if (yongshi<=6000) {
                System.out.println("����ָ����ȷ��Ӣ��" + hero.getName() + "���ڵļ�����3�����÷�-9--��ʱ" + (yongshi / 1000) + "��");
                if ((yongshi/1000)>6){
                    System.out.println("��̫���ˣ��ѳ�ʱ�������¿�ʼ��Ϸ");
                }
            }else  if (yongshi<=8000) {
                System.out.println("����ָ����ȷ��Ӣ��" + hero.getName() + "���ڵļ�����2�����÷�-6--��ʱ" + (yongshi / 1000) + "��");
            }else  if (yongshi<=10000) {
                System.out.println("����ָ����ȷ��Ӣ��" + hero.getName() + "���ڵļ�����1�����÷�-3--��ʱ" + (yongshi / 1000) + "��");
            }else {
                System.out.println("�������̫���ˣ��ѳ�ʱ");
            }
        }else {
            System.out.println("��������");
        }
    }
}
