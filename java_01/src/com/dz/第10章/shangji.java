package com.dz.第10章;

public class shangji {
    public static void main(String[] args) {
        int[] a={3,5,9,2,6};
        int b=a[0];
        int index=0;
        System.out.println("最初结果：");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            if (a[i]>b){
                b=a[i];
                index=i;
            }
        }
        System.out.println("\n最大值:"+b);
        System.out.println("下标为："+index);
    }
}
