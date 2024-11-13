import java.util.Arrays;
public class secondLargest {
    public static void main(String[]args){
        int []arr={9,11,30,15,40,10,35};
        if(arr.length<2){
            System.out.println("Enter atleast two number");
            return;
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-3]);
    }
    
}
