public class FJP_method_overloading {
    static void foo(){
        System.out.println("Hello World!");
    }

    static void foo(String name){
        System.out.println("Hello " + name + "!");
    }

    public static void main(String[] args) {
        foo();
        foo("Sumit");
    }
}
