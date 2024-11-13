import java.util.*;
public class GreaterBetweenTwo {
    public static void input(){
        System.out.println("Enter Two number to find compare");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=maximum(a,b);
        System.out.println("The greater number between two is "+c);
    }
    public static int maximum(int x,int y){
        int result;
        result=(x>y) ? x: y;
        return result;
    } 

    public static void main(String []args){
        // greater between two interger using ternary operator and method.
        input();
    }
}
