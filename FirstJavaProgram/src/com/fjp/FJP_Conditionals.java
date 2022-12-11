package com.fjp;

public class FJP_Conditionals {
    public static void main(String[] args) {
        int[] ages = {12, 20, 61, 5};
        for (int age : ages) {
            if (age > 50) {
                System.out.println("Too old");
            } else if (age > 18) {
                System.out.println("You are eligible");
            } else {
                System.out.println("Not eligible");
            }
        }
    }
}
