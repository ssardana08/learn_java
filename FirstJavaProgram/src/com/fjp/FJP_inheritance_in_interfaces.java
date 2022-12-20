package com.fjp;

interface SampleInterface{
    void func1();
    void func2();
}

interface ChildInterface extends SampleInterface{
    void func4();
    void func3();
}

class ObjectClass implements ChildInterface{
    public void func3(){
        System.out.println("Function 3");
    }
    public void func4(){
        System.out.println("Function 4");
    }
    public void func1(){
        System.out.println("Function 1");
    }
    public void func2(){
        System.out.println("Function 2");
    }
}
public class FJP_inheritance_in_interfaces {
    public static void main(String[] args) {
        ObjectClass oc = new ObjectClass();
        oc.func1();
        oc.func2();
        oc.func3();
        oc.func4();
    }
}
