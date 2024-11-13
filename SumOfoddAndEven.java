// WAP to find the sum of even and odd digits of number 
class SumOfoddAndEven{
    public static void main(String [] args){
        int num = 1234;
        int res_even=0; int res_odd=0;
        while(num>0){
            int last= num%10;
            if(last%2==0){
                res_even=res_even+last;
            }
            else{

                res_odd=res_odd+last;        
            }
            
            num=num/10;
        }
        System.out.println("sum of even digits"+res_even);
        System.out.println("sum of odd digits"+res_odd);
        
        
        
    }
    
}