package com.fjp;

import com.fjp.Table;

public class Main {

    public static void sum(){

        System.out.println("Sum of numbers!");

        int num1 = 3;
        int num2 = 5;
        int num3 = 9;
        int sum = num1 + num2 + num3;
        System.out.println(sum);
    }

    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        sum();
        Table t = new Table();
        TableExecutor te = new TableExecutor();
        te.run(t.counter);
        for (String key: t.counter.keySet()){
            System.out.printf("%s: %d \n", key, t.counter.get(key));
        }
        System.out.println();
    }
}