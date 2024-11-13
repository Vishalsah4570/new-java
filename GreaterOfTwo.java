import java.util.*;
public class GreaterOfTwo {
    public static int GreaterFind(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int great=GreaterFind(a,b);
        System.out.print(great);
    }
}
