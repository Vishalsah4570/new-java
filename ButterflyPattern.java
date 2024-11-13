public class ButterflyPattern {
    public static void main(String []args){
        //first Upper-half
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
        }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }    
        System.out.println();    
        }
        //lower-half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
        }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }    
        System.out.println();    
        }
    }
}
