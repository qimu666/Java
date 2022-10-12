package com.dz.work.work02.homework13;

/*
           (1)做一个Student类，Student类有名称(name),性别(sex),年龄(age)，学号(stu id)，
           做合理封装，通过构造器在创建对象时将4个属性赋值。
           (2)写一个Teacher类，Teacher类有名称(name),性别(sex),年龄(age)，工龄(work age),
           做合理封装，通过构造器在创建对象时将4个属性赋值。
           (3)抽取一个父类Person类，将共同属性和方法放到Person类
           (4)学生需要有学习的方法(study),在方法里写生"我承诺,我会好好学习。”
           (5)教师需要有教学的方法(teach)，在方法里写上“我承诺，我会认真教学。
           (6)学生和教师都有玩的方法(ply)，学生玩的是足球，老师玩的是象棋.
              此方法是返回字符串的，分别返回“Xx爱玩足球”和“Xx爱玩象棋”（其
              中xx分别代表学生和老师的姓名)。因为玩的方法名称都一样，所以要求
              此方法定义在父类中，子类实现重写。
              应当分析出，我们需要打印信息的方法,printInfo().
           (7)定义多态数组，里面保存2个学生和2个教师，要求按年龄从高到低排序
           (8)定义方法，形参为Person类型，功能：调用学生的study或教师的
           teach方法
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Student("小明", '男', 18, 144);
        person[1] = new Student("小美", '女', 38, 567);
        person[2] = new Teacher("王老师", '男', 58, 3);
        person[3] = new Teacher("李老师", '女', 28, 8);

        PersonTest personTest = new PersonTest();
        personTest.paiXu(person);
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
        System.out.println("\n\n+++++++++++调用zhuanXing方法++++++++++");
        for (int i = 0; i < person.length; i++) {
            personTest.zhuanXing(person[i]);
        }
        System.out.println("\n\n____________________________________________________");
        Teacher teacher = new Teacher("小明", '男', 18, 144);
        Student student = new Student("小美", '女', 38, 567);
        teacher.printinfo();
        System.out.println("_____________");
        student.printinfo();
    }

    public void paiXu(Person[] person) {
        Person tem = null;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() < person[j + 1].getAge()) {
                    tem = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = tem;
                }
            }
        }
    }

    public void zhuanXing(Person person) {
        if (person instanceof Student) {
            ((Student) person).study();
        }
        if (person instanceof Teacher) {
            ((Teacher) person).teach();
        } else {
            System.out.println(">>>>>>>>>>>>>>>>");
        }
    }
}
