package com.dz.work.work02.homework10;

public class DoctorTest {
    /*10.编写Doctor类{name,age,job,gender,sal}
         相应的getter()和setter(0方法，5个参数的构造器，重写父类的equals()方法：
         public boolean equals(Object obj),并判断测试类中创建的两个对像是否相等。
         相等就是判断属性是香相同
     */
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("ww", 20, "老师", "女", 1111);
        Doctor doctor2 = new Doctor("ww", 10, "老师", "女", 1111);
        System.out.println(doctor1.equals(doctor2));
    }
}
