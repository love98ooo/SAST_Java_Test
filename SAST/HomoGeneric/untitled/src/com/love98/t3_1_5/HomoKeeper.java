package com.love98.t3_1_5;

class HomoKeeper<T extends Homo> {
    private T homo;

    public void add(T homo) {
        this.homo = homo;
    }

    public T get() {
        return homo;
    }

    public void printHomo() {
        if (homo.isYaJu()) {
            System.out.print("24岁，是学生。");
        }
    }

}