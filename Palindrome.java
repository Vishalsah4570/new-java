import java.util.*;
public class Palindrome {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int temp=number;
    int sum=0;
    int remainder=0;
    while(number!=0){
        remainder=number%10;
        sum=sum*10+remainder;
        number/=10;
    }                   
    if(sum==temp){
        System.out.println("Palindrome number");
    }else{
        System.out.println("Not Palindrome number");
        }
    }
}
