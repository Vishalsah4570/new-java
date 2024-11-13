import java.util.*;
public class Fibonacci_series {
    public static void main(String[]args){
        System.out.println("Enter the Nth number want a fibonacci");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int first=0;
        int second=1;
        int result;
        for(int i=1;i<=n;i++){
            System.out.print(first + ",");
            result=first+second;
            first=second;
            second =result;
        }
        

    }
}
