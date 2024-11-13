public class butterfly {
    public static void main(String[]args){
        int n=8;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}       
