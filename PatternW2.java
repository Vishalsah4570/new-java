public class PatternW2 {
    public static void main(String[]args){
        int i=1;
        while(i<=4){
            int j=1;
            while(j<=5){
                if(i==1||j==1||i==4||j==5){
                    System.out.print("*");
                    j++;
                }else{
                    System.out.print(" ");
                    j++;
                }

            }
        System.out.println(); 
        i++;   
        }
    }
}
