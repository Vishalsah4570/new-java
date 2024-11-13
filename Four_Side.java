public class Four_Side {
    public static void main(String []args){
        int n=14;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n||j==n||i==1||j==1||i<=14&&j==7||j>=1&&i==7){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
