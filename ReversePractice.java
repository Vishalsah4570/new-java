import java.util.*;
public class ReversePractice {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int reverse=0, remainder=0;
        while(number!=0){
            remainder=number%10;
            reverse=reverse*10+remainder;
            number/=10;
        }
        System.out.println("The reverse number is "+reverse );
    }
}
