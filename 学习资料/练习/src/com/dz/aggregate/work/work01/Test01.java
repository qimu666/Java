package com.dz.aggregate.work.work01;

import java.util.ArrayList;

public class Test01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
     /* 按要求实现：
        (1)封装一个新闻类，包含标题和内容属性，提供get、set方法，重写toString方法，打印对象
        时只打印标题；
        (2)只提供一个带参数的构造器。实例化对像时，只初始化标题；并且实例化两个对象：
        新闻一：新冠确诊病例超干万，数百万印度教信徒赴恒河“圣浴”引民众担忧
        新闻二：男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生
        (3)将新闻对象添加到ArrayList!集合中，并且进行倒序遍历；
        (4)在遍历集合过程中，对新闻标题进行处理，超过15字的只保留前15个，然后在后边加
        (5)在控制台打印遍历出经过处理的新闻标题；
      */
        News news1 = new News("新冠确诊病例超干万，数百万印度教信徒赴恒河“圣浴”引民众担忧");
        News news2 = new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");
        ArrayList arrayList = new ArrayList();
        arrayList.add(news1);
        arrayList.add(news2);
//        for (Object o : arrayList) {
//            News news = (News) o;
//            if (news.getTitle().length() >= 15) {
//                System.out.println(o+"....");
//            }
//        }
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            News news = (News) arrayList.get(i);
            System.out.println(processing(news.getTitle()));
        }
    }

    public static String processing(String title) {
        if (title == null) {
            return "";
        }
        if (title.length() >= 15) {
            //substring 取值[0,15)
            return title.substring(0, 15) + "........";
        } else {
            return title;
        }
    }
}

class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return
                "title='" + title;
    }
}