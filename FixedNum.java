class FixedNum{
    public static void main(String args[]){
        //1st digit to print
        int num=98758;
        while(num>9){
            num=num/10;
        }
        System.out.println("The first digit is "+(num%10));
    }
}