public class FJP_variadic_args {
    static int sum(int ...nums){
        int result = 0;
        for (int num:nums){
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
    }
}
