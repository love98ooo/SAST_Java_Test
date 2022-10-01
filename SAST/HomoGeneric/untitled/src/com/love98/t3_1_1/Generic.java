/**
 * 基于泛型修改后
 */
package com.love98.t3_1_1;

public class Generic {
    public static void main(String[] args) {
        HomoKeeper<Integer> keeper = new HomoKeeper();
        keeper.add(114514);
        Integer homo = keeper.get();
        System.out.print(homo);
    }
}

class HomoKeeper<T> {
    private T homo;
    public void add(T homo) {
        this.homo = homo;
    }
    public T get() {
        return homo;
    }
}

