public class Plus_pattern {
    public static void main(String[]args){
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if((j==3&&i>=0)||(i==3&&j>=0)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
