package dz.Test03;

public class Graduate extends Student{
     private String instrutor="����";
     private String research="�����";

    @Override
    public void logln() {
        System.out.println("��½�ɹ���");
        System.out.println("������ϢΪ��");
        System.out.println("ѧ��"+getId());
        System.out.println("����"+getName());
        System.out.println("�༶"+getClassName());
        System.out.println("��ʦ��"+instrutor);
        System.out.println("�о�����"+research);
    }
    @Override
    public void clearOut() {
        System.out.println("ע���ɹ���");
    }

}
