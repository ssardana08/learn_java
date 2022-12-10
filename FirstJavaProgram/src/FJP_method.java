public class FJP_method {
    static int logic(int x, int y){
        if (x > y){
            return x + y;
        }else{
            return (x + y) * 5;
        }
    }

    public static void main(String[] args) {
        int a1 = 12;
        int b1 = 10;
        System.out.println(logic(a1, b1));

        a1 = 10;
        b1 = 12;
        System.out.println(logic(a1, b1));
    }
}
