import java.util.*;
public class InputJavaArrayMaxMin {
    public static void main(String[]args){
        System.out.println("Enter the number of element");
        Scanner sc=new Scanner(System.in);
        int element=sc.nextInt();
        int []arr=new int[element];
        System.out.println("Enter all the element in a list you want to check");
        for(int i=0;i<element;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int min=0;
        for(int i:arr){
            if(i>max){
                max=i;
            }if(min>i){
                min=i;
            }
        }
        System.out.println("The max value is "+max+"The min value is "+min);

    }
}
