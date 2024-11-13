import java.util.*;
public class GreatOfTwoUsingTernary {
    public static int Find(int a,int b){
        return a>b? a:b;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("Among two of number you have entered is "+Find(a,b));
    }
}
