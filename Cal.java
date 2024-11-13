import java.util.*;
public class Cal {
    public static void main(String[] args){
 Scanner First=new Scanner(System.in);
 System.out.println("Enter a number");
int FirstNum=First.nextInt();
Scanner Second=new Scanner(System.in);
 System.out.println("Enter Second number");
int SecondNum=Second.nextInt();
Scanner Ope=new Scanner (System.in);
System.out.println("+,-,*,/");
String operator=Ope.nextLine();
if(operator=="+"){
    System.out.println(x:"The sum of two number is "+ (FirstNum+SecondNum));
}else{
    System.out.println("Wrong input");
}

    }
}
