package com.fjp;

abstract class Parent{
    Parent(){
        System.out.println("Parents welcome you!");
    }

    abstract void greet();
    abstract void greet2();
}

class Child1 extends Parent{
    @Override
    void greet() {
        System.out.println("Hello World! We greet you.");
    }

    @Override
    void greet2() {
        System.out.println("Hello World! We greet you 2.");
    }
}

abstract class Child2 extends Parent{
    public void hey(){
        System.out.println("Hello! Welcome to child2");
    }
}

public class FJP_abstract {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.greet();
    }
}
