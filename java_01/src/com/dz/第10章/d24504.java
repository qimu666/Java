package com.dz.第10章;

public class d24504 {
    public static void main(String[] args) {
        int[] a={33,55,99,44,66};
        int max=0;
        System.out.print("最初排序：");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j+1]>a[j]){
                    max=a[j];
                    a[j]=a[j+1];
                    a[j+1]=max;
                }
            }
        }
        System.out.print("\n从大到小排序：");
        for (int i=0;i<a.length;i++){
            System.out.print(+a[i]+" ");
        }
    }
}
