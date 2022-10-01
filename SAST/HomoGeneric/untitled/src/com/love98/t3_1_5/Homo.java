package com.love98.t3_1_5;

public class Homo {
    public Integer age;

    Homo(Integer age) {
        this.age = age;
    }

    public boolean isYaJu() {
        return new Integer(24).equals(age);
    }
}
