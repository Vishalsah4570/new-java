import java.util.*;
public class UserInput {
    public static void main(String [] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter A number");
        int x= num.nextInt();
        if(x%2==0){
            System.out.println("It's a even Number");
        }else{
            System.out.println("It's a odd Number");
        }
    }
}
