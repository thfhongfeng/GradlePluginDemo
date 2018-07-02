package com.pine.gradle.extension;

/**
 * Created by tanghongfeng on 2018/7/2.
 */

public class PersonConfig {
    private String name;
    private boolean isBoy;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBoy() {
        return isBoy;
    }

    public void setIsBoy(boolean boy) {
        isBoy = boy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
