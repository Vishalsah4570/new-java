import java.util.*;
public class FirstFunctionOfMultiply {
    public static int Mul(int a,int b){
        return a*b;
    }    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
       
        System.out.println(Mul(7,8));
    }
}
