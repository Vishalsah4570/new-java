public class maxMin{
    public static void main(String []args){
        int[] arr={4,9,8,2,13};
        int max= arr [0];
        int min= arr [0];
        for(int x:arr){
            if(x>max){
            max=x;
            }if(x<min){
                min=x;
            }
        }
        System.out.println("The max value is "+max+" the min value is "+min);
    }
}