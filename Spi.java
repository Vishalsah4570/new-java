class Spi{
    public static void main(String[] args){
        int num=145;
        int sum=0;
        int product=1;
        while(num>0){
            int last = num%10;
            sum= sum+last;
            product=product*last;
            num=num/10;

        }
        if(sum==product){
            System.out.println("A spi number");
        }
        else{
            System.out.println("not a spi number");
        }
    }
}