package com.dz.work.work01;

public class Work01 {
    /*
    1.��д��A01,���巽��max,ʵ����ĳ��double��������ֵ��������
     */
    public static void main(String[] args) {
        int[] arr = {3, 1, 45, 6,100,-1,100000};
        A01 a01 = new A01();
        System.out.println(a01.max(arr));

    }

    static class A01 {
        public double max(int[] arr) {
            double max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[0] < arr[i]) {
                    arr[0] = arr[i];
                    max = arr[0];
                    arr[i] = (int) max;
                }
            }
            return max;
        }
    }
}
