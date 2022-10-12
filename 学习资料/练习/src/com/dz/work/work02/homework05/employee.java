package com.dz.work.work02.homework05;

public class employee {
    /*
    5.设计父类一员工类。子类：工人类(worker),农民类(Peasant),
      教师类(Teacher),科学家类(Scientist),服务生类(Waiter)。
      (1)其中工人，农民，服务生只有基本工资
      (2)教师除基本工资外，还有课酬（元/天）
      (3)科学家除基本工资外，还有年终奖
      (4)编写一个测试类，将各种类型的员工的全年工资打印出来
     */
    private double salary;

    public employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void print(){
        System.out.println(salary*12);
    }
}
