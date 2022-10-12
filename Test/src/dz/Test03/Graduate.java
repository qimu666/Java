package dz.Test03;

public class Graduate extends Student{
     private String instrutor="张三";
     private String research="计算机";

    @Override
    public void logln() {
        System.out.println("登陆成功！");
        System.out.println("您的信息为：");
        System.out.println("学号"+getId());
        System.out.println("姓名"+getName());
        System.out.println("班级"+getClassName());
        System.out.println("导师："+instrutor);
        System.out.println("研究方向："+research);
    }
    @Override
    public void clearOut() {
        System.out.println("注销成功！");
    }

}
