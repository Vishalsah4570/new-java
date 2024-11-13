public class StrongNum2 {
    public static void main(String args[]){
        int num=145;
        int n=0;
        int temp=num;
        while(num>0){
            n=num/10;
            n++;
        }
        System.out.println(n);
    }
}
