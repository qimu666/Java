package com.dz.集合框架.ye172;

//import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    //    private static Logger logger=Logger.getLogger(Test.class);
    public static void main(String[] args) {
        Hero hero = new Hero("张三", "男", 19);
        Hero hero1 = new Hero("李四", "女", 20);
        Hero hero2 = new Hero("王二", "男", 21);
        Hero hero3 = new Hero("麻子", "女", 21);
        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(hero);
        heroes.add(hero1);
        heroes.add(hero2);
        heroes.add(hero3);
//        heroes.remove(1);
        heroes.add(1,hero3);
        ArrayList<String> string = new ArrayList<>();
        for (String strings : string) {
            if (Collections.frequency(string,heroes)<1){
                string.add(strings);
            }
            System.out.println(string);
        }
//        for (Hero strings : heroes) {
////            System.out.println(hero4.getName() + hero4.getSex() + hero4.getAge());
//            if (Collections.frequency(string,heroes)<1){
//                string.add();
//            }

//        }
//        System.out.println(string);
//        System.out.println("++++++++++++++++++++");
//        for (int i = 0; i < heroes.size(); i++) {
//            Hero hero4 = heroes.get(i);
//            System.out.println(hero4.getName() + hero4.getSex() + hero4.getAge());
////            logger.info(hero4.getName()+hero4.getSex()+hero4.getAge());
//        }
    }
}
