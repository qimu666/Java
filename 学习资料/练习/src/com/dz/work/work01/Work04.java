package com.dz.work.work01;

public class Work04 {
    /*
       编写类A04,实现数组的复制功能copyArr,输入旧数组，返回一个新数组，元素和旧数组一样
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7};
        A04 a04 = new A04();
        a04.copyArr(arr);
    }
}
class A04 {
    public int[] copyArr(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
            System.out.print(newArr[i]+" ");
        }
        System.out.println();
        return newArr;
    }
}