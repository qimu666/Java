package com.dz.rentalHouse.view;

import com.dz.rentalHouse.house.House;
import com.dz.rentalHouse.service.HouseSrevice;
import com.dz.rentalHouse.utility.Utility;

/*
1.显示界面
2.接收用户的输入
3.调用HouseService完成对房屋信息的各种操作
*/
public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseSrevice houseSrevice = new HouseSrevice(10);

    public void mainMenu() {
        while (loop) {
            System.out.println("_____________房屋出租系统_____________");
            System.out.println("\t\t1.新增房源");
            System.out.println("\t\t2.查找房屋");
            System.out.println("\t\t3.删除房屋");
            System.out.println("\t\t4.修改房屋信息");
            System.out.println("\t\t5.房屋列表");
            System.out.println("\t\t6.退   出");
            System.out.println("请输入您的选择(1-6):");
            char c = Utility.readChar();
            switch (c) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    selectHou();
                    break;
                case '3':
                    deleteHouse();
                    break;
                case '4':
                    reviseHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    etic();
                    break;
                default:
                    System.out.println("——————————输入有误请重新选择————————");
                    break;
            }
        }
    }

    /*退出菜单，通过使用Utility工具类的readConfirmSelection()方法判断用户的输入是否为大写Y,
      是Y就退出程序，N就退到菜单，否则继续输入（y\n）,不是y/n就一直输出选择信息。
     */
    public void etic() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
            System.out.println("您成功退出了系统");
        }
    }

    /*
       房屋列表界面：
     */
    public void listHouse() {
        System.out.println("_______________房屋列表__________________");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        //定义一个新的动态数组，用于接收houseSrevice类中list()方法返回的house对象.
        House[] houses = houseSrevice.list();
        //遍历输出这个新的动态数组，完成房屋列表菜单
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("———————————————房屋列表完成———————————————-\n");
    }

    /*
    添加房屋信息界面
    通过Utility工具类的各个方法接收用户输入的信息，
    limit表示可以输入的最大长度，defaultValue表示默认值，用户按下回车键默认接收配置的defaultValue值
     */
    public void addHouse() {
        System.out.println("———————————————添加房屋———————————————-");
        System.out.println("姓名：");
        String name = Utility.readString(5);
        System.out.println("电话：");
        int phone = Utility.readInt(11);
        System.out.println("地址：");
        String address = Utility.readString(10);
        System.out.println("月租：");
        int rent = Utility.readInt(2500);
        System.out.println("状态(已出租/未出祖)：");
        String state = Utility.readString(3, "未出祖");
        System.out.println("———————————————添加完毕———————————————-\n");
        //创建一个房屋信息的对象newHouse（可以理解为有人来租房）
        //注意 id是系统分配的
        House newHouse = new House(0, name, phone, address, rent, state);
        //通过调用houseSrevice类中的add()方法，用if判断是否添加成功
        if (houseSrevice.add(newHouse)) {
            System.out.println("———————————————添加成功———————————————-\n");
        } else {
            System.out.println("———————————————添加房屋失败———————————————-\n");
        }
    }

    //查找房屋信息界面：
    public void selectHou() {
        System.out.println("———————————————查找房屋———————————————-");
        System.out.println("请输入你要查找的房屋编号：");
        int id = Utility.readInt();
        House house = houseSrevice.select(id);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("该房屋没有人入住");
        }
        /**
         * 配合第二种select方法调用
         */
//        houseSrevice.select(id);
    }

    //编写deleteHouse() 接收输入的id 调用HouseService的delete方法
    public void deleteHouse() {
        System.out.println("———————————————删除房屋———————————————-");
        System.out.println("请选择要删除的房屋编号（-1退出）");
        int i = Utility.readInt();
        if (i == -1) {
            System.out.println("放弃删除房屋信息");
            return;
        }
        //注意该方法本身就有循环判断的逻辑 必须输入y/N
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {//真的删除
            if (houseSrevice.delete(i)) {
                System.out.println("===========删除房屋信息成功=========\n");
            } else {
                System.out.println("===========房屋编号不存在，删除失败\n");
            }
        } else {
            System.out.println("===========放弃删除房屋信息=========\n");
        }
    }
    //根据id修改房屋信息
    public void reviseHouse() {
        System.out.println("———————————————修改房屋———————————————-");
        System.out.println("请输入你要查找的房屋编号(-1退出)：");
        int readInt = Utility.readInt();
        if (readInt == -1) {
            return;
        }
        //根据输入得到readInt 查找对象
        //特别提示：返回的是引用类型[即：就是数组的元素]
        //因此在后面对house.setXxx(),就会修改HouseService中数组的元素！！！
        House house = houseSrevice.select(readInt);
        if (house == null) {
            System.out.println("该房屋编号不存在\n");
            return;
        }
        System.out.print("姓名(" + house.getName() + "): ");
        //这里如果用户直接回车表示不修改信息 默认""
        String name = Utility.readString(8, "");
        if (!"".equals(name)) {//修改
            house.setName(name);
        }
        System.out.print("电话(" + house.getPhone() + "):");
        int phone = Utility.readInt(-1);
        if (phone != -1) {
            house.setPhone(phone);
        }
        System.out.print("地址(" + house.getAddress() + "):");
        String address = Utility.readString(18, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }
        System.out.print("租金(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }
        System.out.println("状态(" + house.getState() + "):");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }
        System.out.println("===========修改房屋信息成功=========\n");
    }
}
