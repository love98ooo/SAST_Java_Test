package com.love98.t;

public class Nun implements Boy, Fish, FishMan{
    @Override
    public void say() {
        System.out.println("你应该下地狱");
    }

    @Override
    public void play() {
        System.out.println("子非鱼安知鱼之非乐?");
    }
    private String message;
    public Nun() {
    }

    public Nun(String message) {
        this.message = message;
    }

    public void show() {
        System.out.println(this.message);
    }

    public static void main(String[] args) {
        Nun n = new Nun();
        System.out.println(n.message);
        n.play();
        n.say();
        n = new Nun("人不可以,至少不应该");
        n.show();
    }
}
