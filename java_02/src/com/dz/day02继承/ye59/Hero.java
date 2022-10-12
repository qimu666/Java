package com.dz.day02继承.ye59;

public class Hero extends Preson {
    private String loyalty;
    private String occupation;

    public Hero() {

    }

    public Hero(String loyalty, String occupation) {

    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(String loyalty) {
        this.loyalty = loyalty;
    }

    public void affairs() {

    }

    public void work() {

    }

    public void Print() {
        System.out.println("姓名:" + getName() + "\n生命值：" + getHealth() + "\n亲密度：" + getLoyalty() + "\n职业：" + getOccupation());
    }
}
