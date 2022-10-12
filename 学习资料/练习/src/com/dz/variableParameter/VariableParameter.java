package com.dz.variableParameter;

public class VariableParameter {
    /*
        有三个方法，分别实现
        返回姓名和两门课成绩（总分），
        返回姓名和三门课成绩（总分)，
        返回姓名和五门课成绩（总分）。
        封装成一个可变参数的方法
        类名HspMethod方法名showScore
     */
    public static void main(String[] args) {
        HspMethod hspMethod = new HspMethod();
        System.out.println(hspMethod.showScore("小明",12.0,12.0));
        System.out.println(hspMethod.showScore("小红",12.0,12.0,06.8));
        System.out.println(hspMethod.showScore("张三",12.0,12.0,14.9,9.1,12.1));
    }
}
class HspMethod{
    public String showScore(String a,double... b){
           double res=0;
        for (int i = 0; i < b.length; i++) {
            res+=b[i];
        }
        return a+b.length+"门成绩总和为"+res;
    }
}