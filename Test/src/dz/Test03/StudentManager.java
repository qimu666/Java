package dz.Test03;

import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        UnderGraduate underGraduate = new UnderGraduate();
        Graduate graduate = new Graduate();
        Scanner scanner = new Scanner(System.in);
        System.out.println("��ѡ������ѧ����(1.���� 2.�о���)");
        int sr = scanner.nextInt();
        if (sr == 1) {
            System.out.println("��ѡ�����Ĳ�����1.��¼ 2.ע��");
            int i = scanner.nextInt();
            if (i == 1) {
                System.out.println("����������ѧ�ţ�");
                underGraduate.setId(scanner.nextInt());
                System.out.println("����������������");
                underGraduate.setName(scanner.next());
                System.out.println("���������İ༶��");
                underGraduate.setClassName(scanner.next());
                underGraduate.logln();
            } else if (i == 2) {
                underGraduate.clearOut();
            } else {
                System.out.println("��ѡ����ȷ�Ĳ�����");
            }
        } else if (sr == 2) {
            System.out.println("��ѡ�����Ĳ�����1.��¼ 2.ע��");
            int q = scanner.nextInt();
            if (q == 1) {
                System.out.println("����������ѧ�ţ�");
                graduate.setId(scanner.nextInt());
                System.out.println("����������������");
                graduate.setName(scanner.next());
                System.out.println("���������İ༶��");
                graduate.setClassName(scanner.next());
                graduate.logln();
            } else if (q == 2) {
                graduate.clearOut();
            } else {
                System.out.println("��ѡ����ȷ�Ĳ�����");
            }

        } else {
            System.out.println("��������");
        }

    }
}
