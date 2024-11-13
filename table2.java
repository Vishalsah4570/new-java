import java.util.*;
public class table2 {
    public static void main(String[]args){
        System.out.println("Enter the number you want to check");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0||num%3==0){
            System.out.print("The Number "+num+" is not a prime number ");
        }else{
            System.out.print("The Number "+num+" is a prime number ");
        }
    }
}
