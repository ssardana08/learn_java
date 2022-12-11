package com.fjp;

import java.util.Scanner;

public class FJP_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter URL: ");
        String url = sc.next();

        String protocol = url.split(":")[0];
        switch (protocol){
            case "http":
                System.out.println("Not Secured!");
                break;
            case "https":
                System.out.println("Secured");
                break;
            default:
                System.out.println("Invalid Protocol");
        }
    }
}
