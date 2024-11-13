import java.util.*;
public class leapYear {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int leap=sc.nextInt();
        if(leap%4==0){
            if(leap%100!=0){
                if(leap%400==0){
                    System.out.println("The year you entered is "+leap +"leap year");
                }
            }
        }else{
            System.out.println("Invalid input");
        }
    }
}
