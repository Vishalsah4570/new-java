class FixedProduct{
    public static void main(String args[]){
        //sum of fixed number
        int num=98758;
        int product=1, remainder=0;
        while(num>0){
            remainder=num%10;//8
            product*=remainder;//0+8=8
            num/=10;//9875 will send for next loop
        }
        System.out.println(product);
    }
}       