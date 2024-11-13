class FixedProduct{
    public static void main(String args[]){
        //sum of fixed number
        int num=98758;
        int sum=0, remainder=0;
        while(num>0){
            remainder=num%10;
            sum+=remainder;
        }
        System.out.println("The first digit is "+ sum);
    }
}