package dz.Test03;

public class UnderGraduate extends Student {
    private String counsellors="小丽";

    @Override
    public void logln() {
        System.out.println("登陆成功！");
        System.out.println("您的信息为：");
        System.out.println("学号"+getId());
        System.out.println("姓名"+getName());
        System.out.println("班级"+getClassName());
        System.out.println("辅导员："+counsellors);
    }
    @Override
    public void clearOut() {
        System.out.println("注销成功！");
    }
}
