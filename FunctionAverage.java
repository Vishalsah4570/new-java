import java.util.*;
public class FunctionAverage {
    public static void FunctionAverage(int a,int b,int c){
        System.out.print((a+b+c)/3);
        return ;
    }
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
      FunctionAverage(a,b,c);
    }
}
