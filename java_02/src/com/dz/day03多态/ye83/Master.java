package com.dz.day03多态.ye83;

public class Master {

    public void feed(Hreo hreo){
        hreo.blood();
    }
    public void feed(Army army){
        army.blood();
    }
    public void feed(Guaiwu guaiwu){
        guaiwu.blood();
    }
    public void feed(Person person){
        person.blood();
    }
//    public void Work(Person person) {
//
//        if (person instanceof Hreo) {
//            Hreo hreo = (Hreo) person;
//            hreo.affairs();
//        } else if (person instanceof Army) {
//            Army army = (Army) person;
//            army.patrol();
//        }else if (person instanceof Guaiwu){
//            Guaiwu guaiwu=(Guaiwu) person;
//            guaiwu.patrol();
//        }
//    }
}
