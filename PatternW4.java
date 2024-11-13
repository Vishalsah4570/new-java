public class PatternW4 {
    public static void main(String[]args){
        int i=1;
        while(i<=10){
            int j=10;
            while(j>i){
                System.out.print("*");
                j--;
            }
            System.out.println();
                i++;
        }

    }
}
