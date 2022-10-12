package com.dz.testJFrame;

import javax.swing.*;
import java.awt.*;

public class TestJFrame extends JFrame {
    private MyDrawing my=null;

    public static void main(String[] args) {
        int a = ((int) (Math.random() * 30) + 2);
        System.out.println(a);
        new TestJFrame();
    }
    public TestJFrame() {
        my=new MyDrawing();
        this.add(my);
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}

class MyDrawing extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //绘制椭圆
//        g.drawOval(10, 10, 100, 100);
        //画直线
//        g.drawLine(10,10,100,100);
        //画矩形框
//        g.drawRect(10,10,100,100);
        //填充矩形
        //1.设置画笔颜色
//        g.setColor(Color.RED);
        //2.填充
//        g.fillRect(10,10,100,100);
        //填充椭圆
//        g.setColor(Color.BLUE);
//        g.fillOval(10,10,100,100);
        //画图片
//        Image image = Toolkit.getDefaultToolkit().getImage("out/production/tankBattle/my.jpg");
//        g.drawImage(image,10,10,324,432,this);
        //画字符
        g.setColor(Color.green);
        g.setFont(new Font("楷体",Font.BOLD,30));
        //这里的 x,y 的原点是"柒木"的左下角
        g.drawString("柒木",100,100);
    }
}