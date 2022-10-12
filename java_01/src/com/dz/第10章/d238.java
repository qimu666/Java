package com.dz.第10章;

import java.util.Arrays;

public class d238 {
    public static void main(String[] args) {
        int[] aa={1,3,6,8,0,2,4,5,10};
        for (int i=0;i<aa.length;i++){
            Arrays.sort(aa);
            System.out.print(aa[i]+" ");
        }

        System.out.println(" ");
        for (int i=aa.length-1;i>=0;i--){
//            Arrays.sort(aa);
            System.out.print(+aa[i]+" ");
        }
    }
}
