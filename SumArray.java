import java.util.*;
public class SumArray{
    public static void main(String[]args){
    System.out.println("Enter the number of element you want sum");
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int []array=new int[size];
    System.out.println("Enter the numbers");
    for(int i=0;i<size;i++){
        array[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<size;i++){
        sum+=array[i];
    }
    System.out.println("The sum of element will be "+sum);

    }    
}
