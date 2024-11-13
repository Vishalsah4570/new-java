import java.util.*;
public class factorial {
    public static void Factorial(int n){
        int Factorial=1;
        for(int i=n;i>=1;i--){
            if(n<0){
                System.out.println("Invalid input");
            }
            Factorial*=i;
        }
        System.out.print(Factorial);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Factorial(n);

    }
}
