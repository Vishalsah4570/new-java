import java.util.*;
public class ArraySum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want a sum");
        int size=sc.nextInt();
        int[]array=new int[size];
        System.out.println("Enter the number of element you want a sum");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=array[i];
        }
        System.out.println("The sum of array of the element "+sum);
    }
}
