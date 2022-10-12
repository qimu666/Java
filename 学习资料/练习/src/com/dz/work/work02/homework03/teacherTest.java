package com.dz.work.work02.homework03;

public class teacherTest {
    public static void main(String[] args) {
        Professor professor = new Professor("马化腾", 34, "教授", 2000);
        professor.setLevel(1.3);
        System.out.println(professor.introduce());
    }
}
