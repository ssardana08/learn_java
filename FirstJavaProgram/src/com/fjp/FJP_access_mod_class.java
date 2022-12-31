package com.fjp;

import com.fjp2.FJP2_access_FJP_access_mod;

class AccessModifier{
    public int x = 1;
    protected int y = 2;
    int z = 3;
    private int a = 4;

    void print(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

class Subclass extends FJP2_access_FJP_access_mod{
    void run(){
        System.out.println(x);
        System.out.println(y);
//        System.out.println(z);
//        System.out.println(a);

    }
}

public class FJP_access_mod_class {
    public static void main(String[] args) {
        AccessModifier a = new AccessModifier();
        a.print();
        System.out.println();
        System.out.println(a.x);
        System.out.println(a.y);
        System.out.println(a.z);
//        System.out.println(a.a);

        System.out.println();

        Subclass s = new Subclass();
        s.run();

        System.out.println();

        FJP2_access_FJP_access_mod f = new FJP2_access_FJP_access_mod();
        System.out.println(f.x);

    }
}
