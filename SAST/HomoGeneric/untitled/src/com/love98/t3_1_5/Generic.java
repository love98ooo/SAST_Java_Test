package com.love98.t3_1_5;

public class Generic {
    public static void main(String[] args) {
        HomoKeeper<YaJuSenPai> keeper = new HomoKeeper<>();
        keeper.add(new YaJuSenPai(24));
        keeper.printHomo();
    }
}

