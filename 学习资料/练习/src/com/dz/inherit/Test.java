package com.dz.inherit;

public class Test {
    /* 3.在main中，分别创建Person和Student对象，调用say方法输出自我介绍。
     */
    public static void main(String[] args) {
        Person person = new Person("小明", 16);
        Student student = new Student("小白", 18, 123, 90);
        System.out.println(person.say());
        System.out.println(student.say());
    }
}
