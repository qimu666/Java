package com.dz.block;

public class Block {
    /**
     * 代码块
     */
    public static void main(String[] args) {
     /*步骤说明：
    开始步：(1.0)进行类的加载
                1.1 先加载父类A02,
                1.2 再加载B02子类
           (2.0)创建对象
                2.1从子类的构造器开始
    */
        new B02();
    }
}

class A02 {
    private static int n1 = getVal01();//静态属性的初始化          //第一步（01）

    static {
        System.out.println("A02中的静态代码块被调用了");            //第二步
    }

    {
        System.out.println("A02中的普通代码块被调用了");            //第五步（04）最终结果

    }

    public int n3 = getVal02();//普通属性的初始化                  //第六步（01）

    public static int getVal01() {
        System.out.println("getVal01");                         //第一步（02）最终结果
        return 10;
    }

    public int getVal02() {
        System.out.println("getVal02");                       //第六步（02）最终结果
        return 10;
    }

    public A02() {
        //构造器默认隐藏了下面两个：
        //super()                                               //第五步（02）调用父类构造器,
        //普通代码和普通属性的初始化.·····                           //第五步（03）谁在前先执行谁
        System.out.println("A02的构造器被调用");                   //第七步
    }
}

class B02 extends A02 {
    private static int n3 = getVal03();                         //第三步（01）

    static {
        System.out.println("B02中的静态代码块被调用了");            //第四步
    }

    public int n4 = getVal04();                                 //第八步（02）

    {
        System.out.println("B02中的普通代码块被调用了");             //第九步
    }

    public static int getVal03() {
        System.out.println("getVal03");                         //第三步（02）最终结果
        return 10;
    }

    public int getVal04() {
        System.out.println("getVal04");                        //第八步（03）最终结果
        return 10;
    }

    public B02() {
        //构造器默认隐藏了下面两个：
        //super()                                              //第五步（01）调用父类A02中的构造器
        //普通代码和普通属性的初始化.·····                          //第八步（01）谁在前先执行谁
        System.out.println("B02的构造器被调用");                  //第十步
    }
}