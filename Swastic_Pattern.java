public class Swastic_Pattern {
    public static void main(String []args){
        for(int i=0;i<7;i++){
            for (int j=0;j<15;j++){
                if((j==7&&i>=0)||(i==3&&j>=0)||(j==0&&i<3)||(i==6&&j<7)||(i==0&&j>7)||(j==14&&i>3)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
} 
