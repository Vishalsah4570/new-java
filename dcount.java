public class dcount {
    public static void main(String[] args) {
        int num=5555;
        int count=0;
        while(num!=0)
        {
            num=num/10;
            count++;

        }
        System.out.println("number of digits:" + count
        );
    }
}
