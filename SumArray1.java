import java.util.*;
public class SumArray1 {
    public static void main(String[]args){
        System.out.println("Enter the number of element you want to add");
        Scanner sc=  new Scanner(System.in);
    int size=sc.nextInt();
    int []array=new int[size];
    System.out.println("the sum of element you entered");
    for(int i=0;i<size;i++){
        array[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<size;i++){
        sum+=array[i];
    }
    System.out.println("The sum of the number"+sum);
    }
}
