package com.dz.day05.ye124;

public class Hero {
     public String name ;
     public int levelNo;//当前级别
     public int curScore;//当前级别得分
     public long startTime;//当前级别开始时间
     public int elapsedTime;//当前级别已用时间

     public Hero() {
     }

     public Hero(String name, int levelNo, int curScore, long startTime, int elapsedTime) {
          this.name = name;
          this.levelNo = levelNo;
          this.curScore = curScore;
          this.startTime = startTime;
          this.elapsedTime = elapsedTime;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getLevelNo() {
          return levelNo;
     }

     public void setLevelNo(int levelNo) {
          this.levelNo = levelNo;
     }

     public int getCurScore() {
          return curScore;
     }

     public void setCurScore(int curScore) {
          this.curScore = curScore;
     }

     public long getStartTime() {
          return startTime;
     }

     public void setStartTime(long startTime) {
          this.startTime = startTime;
     }

     public int getElapsedTime() {
          return elapsedTime;
     }

     public void setElapsedTime(int elapsedTime) {
          this.elapsedTime = elapsedTime;
     }

     public void play(){

     }
}
