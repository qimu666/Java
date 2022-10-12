package com.dz.day02继承.ye61;

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

    public void Print() {
        System.out.println("姓名:" + getName() + "\n生命值：" + getHealth());
        System.out.println("亲密度：" + loyalty + "职业" + occupation);
    }
}
