package com.fjp;

class A{
    public void method(){
        System.out.println("I am method of class A");
    }
}

class B extends A{
    @Override
    public void method(){
        System.out.println("I am method of class B");
    }
}

public class FJP_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.method();

        B b = new B();
        b.method();
    }
}
