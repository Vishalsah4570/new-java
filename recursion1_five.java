public class recursion1_five {
    public static void PrintNum(int n){
            if (n==0){
                return;
            }
        System.out.println(n);
        PrintNum(n-1);
    }
    public static void main(String []args){
        int n=5;
        PrintNum(n);
    }
}           
