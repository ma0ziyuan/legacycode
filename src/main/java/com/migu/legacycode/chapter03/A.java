package com.migu.legacycode.chapter03;

public class A {
    private int alpha = 0;

    public int getAlpha() {
        return alpha;
    }

    private int getValue() {
        alpha++;
        return 12;
    }

    public int doSomething() {
        int v = getValue();
        int total = 0;
        for (int n = 0; n < 10; n++) {
            total += v;
        }
        return total;
    }
}

