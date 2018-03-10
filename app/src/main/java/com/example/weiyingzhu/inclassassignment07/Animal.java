package com.example.weiyingzhu.inclassassignment07;

import java.io.Serializable;

/**
 * Created by weiyingzhu on 18/3/6.
 */

public class Animal implements Serializable {
    private String name;
    private int age;
    boolean eat;

    public Animal(String name, int age, boolean eat) {
        this.name = name;
        this.age = age;
        this.eat = eat;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isEat() {
        return eat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEat(boolean eat) {
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eat=" + eat +
                '}';
    }
}
