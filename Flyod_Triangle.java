public class Flyod_Triangle {
    public static void main(String[]args){
        int n=5;
        int num=1;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(num+" ");
                j++;
                num++;
            }
            System.out.println();
            i++;
        }
    }
}
