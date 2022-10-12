package com.dz.work.work01;

public class Work13 {
    /*13.��������Ϊ�������ݸ�������
       ��ĿҪ��
       (1)����һ��Circle:�࣬����һ��double�͵�radius���Դ���Բ�İ뾶��һfindArea()
       ��������Բ�������
       (2)����һ����PassObject,�����ж���һ������printAreas(0,�÷����Ķ������£�
       public void printAreas(Circle c,int times)
       //����ǩ��
       (3)��printAreas�����д�ӡ���1��times֮���ÿ�������뾶ֵ���Լ���Ӧ�������
       ���磬timesΪ5��������뾶1,2,3,4,5���Լ���Ӧ��Բ�����
       (4)��main�����е���printAreas()������������Ϻ������ǰ�뾶ֵ���������н��
     */
    public static void main(String[] args) {
        Circle02 circle02 = new Circle02();
        circle02.findArea(3);
        PassObject passObject = new PassObject();
        passObject.printAreas(circle02,8);
    }
}

class Circle02 {
    double radius;

    public double findArea(double radius) {
        return Math.PI * radius * radius;
    }
}
class PassObject{
    public void printAreas(Circle02 c,int times){
        System.out.println("Radius          Area");
        for (double i = 1; i <= times; i++) {
            System.out.println(i+"\t\t\t\t"+c.findArea(i));
        }
    }
}