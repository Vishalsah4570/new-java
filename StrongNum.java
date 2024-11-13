public class StrongNum {
    public static void main(String args[]){
        int num=145;
        int temp=num;
        int sum=0;
        while(num>0){
            int last=num%10;//5
            int fact=1;
            int i=1;
            while(i<=last){
                fact*=i;
                i++;
            }
            sum+=fact;
            num/=10;
        }
        if(temp==sum){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong Number");
        }
    }
}
