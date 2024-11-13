public class Hollow_Diamond {
    public static void main(String[]args){
        int n = 5;  // Height of the diamond (can change this value to adjust the size)
        
        // Upper part of the hollow diamond
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else if (i == n) {  // Creating a solid rectangle inside the diamond
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         }
    }