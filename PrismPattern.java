public class PrismPattern {
    public static void main(String[]args){
        int n=7;
        for(int i=n;i>=1;i--){
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}