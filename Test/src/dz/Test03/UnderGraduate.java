package dz.Test03;

public class UnderGraduate extends Student {
    private String counsellors="С��";

    @Override
    public void logln() {
        System.out.println("��½�ɹ���");
        System.out.println("������ϢΪ��");
        System.out.println("ѧ��"+getId());
        System.out.println("����"+getName());
        System.out.println("�༶"+getClassName());
        System.out.println("����Ա��"+counsellors);
    }
    @Override
    public void clearOut() {
        System.out.println("ע���ɹ���");
    }
}
