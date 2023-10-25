package com.fjp;

public class FInalTesting {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(System.identityHashCode(x));
        x+=4;
        System.out.println(System.identityHashCode(x));
    }
}
