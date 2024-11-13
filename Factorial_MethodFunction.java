import java.util.*;
public class Factorial_MethodFunction {
    public static int FactorialCal(int n){
        if (n<0){
            System.out.println("Invalid Input");
            return 1;
        }
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial*=i;
        }
        System.out.println(factorial);
        return factorial;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=FactorialCal(num);
    System.out.println("Factorial of " + num + " is: " + result);   
        
    }
}
