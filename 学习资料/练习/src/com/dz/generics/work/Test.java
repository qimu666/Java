package com.dz.generics.work;

import java.util.*;

public class Test {
    /* 定义个泛型类DAO<T>,在其中定义一个Map成员变量，Map的键为String类型，值为T类型
       分别创建以下方法：
       (1)public void save(String id,T entity):保存T类型的对象到Map成员变量中
       (2)public T get(String id):从map中获取id对应的对象
       (3)public void update(String id,T entity):替换map中key为id的内容，改为entity对象
       (4)public List<T>list:返回map中存放的所有T对象
       (5)public void delete(String id:删除指定id对象
       定义一个User类：
       该类包含：private成员变量(int类型)id,age;(String类型)name。
       创建DAO类的对象，分别调用其save、get、update、list、delete方法来操作User对象，
     */
    @org.junit.Test
    public void TestList() {
        DAO<User> dao = new DAO();
        dao.save("001", new User("小明", 1, 19));
        dao.save("002", new User("张三", 2, 18));
        dao.save("003", new User("李四", 3, 20));
        dao.delete("002");
        dao.update("001",new User("麻子",1,19));
        List<User> list = dao.list();
        for (User user : list) {
            System.out.println(user);
        }
    }
}

class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList();
        Set<String> set = map.keySet();
        for (String key : set) {
            list.add(map.get(key));
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private String name;
    private int id;
    private int age;

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}