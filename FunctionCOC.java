import java.util.*;
public class FunctionCOC {
    public static double COCircle(int r){
        return (2*3.14*r);
    }
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     int r=sc.nextInt();
     System.out.print("The circumference of a circle is "+COCircle(r));
    }
}
