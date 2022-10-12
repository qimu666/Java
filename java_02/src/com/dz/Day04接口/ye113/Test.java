package com.dz.Day04接口.ye113;

public class Test {
    public static void main(String[] args) {
        CommenPhone commenPhone = new CommenPhone();
        IosPhone iosPhone = new IosPhone();
        commenPhone.show();
        commenPhone.print();
        commenPhone.shipinbofang();
        System.out.println("——————————————————————————————————————————");
        iosPhone.show();
        iosPhone.print();
        iosPhone.youxi();
        iosPhone.shipinbofang();
        iosPhone.shipintonghua();
        iosPhone.xinxi();
        iosPhone.shangwang();
    }
}
