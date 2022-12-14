package com.fjp;

class Base{
    Base(){
        System.out.println("I am a Base class");
    }

    Base(int a){
        System.out.println("I am a Base class with value: " + a);
    }
}

class Derived1 extends Base{
    Derived1(){
        System.out.println("I am a Derived1 class");
    }

    Derived1(int a, int b){
        super(a);
        System.out.println("I am a Derived1 class with value: " + b);
    }

}

public class FJP_constructor_in_inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        System.out.println();
        Derived1 d = new Derived1();
        System.out.println();
        Derived1 d1 = new Derived1(1, 2);
    }
}
