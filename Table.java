import java.util.*;
public class Table{
    public static void main(String [] args){
        Scanner Num=new Scanner(System.in);
        System.out.println("Enter a Number You Want a table");
        int Number=Num.nextInt();
        int i=1;
        while(i<11){
            System.out.println(Number+"x"+i+"="+(Number*i));
            i++;
        }
    }
}