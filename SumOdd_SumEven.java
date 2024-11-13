public class SumOdd_SumEven {
    public static void main(String args[]){
        int num=12345;
        int OddSum=0;
        int EvenSum=0;
        while(num>0){
            int last=num%10;
            if(last%2==0){
                EvenSum+=last;
            }else{
                OddSum+=last;
            }
            num/=10;
        }
        System.out.println("The sum of even number is "+ EvenSum);
            System.out.println("The sum of even number is "+ OddSum);
    }
}
