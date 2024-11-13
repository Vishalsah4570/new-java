public class Try {
    public static void main(String []args){
        int n = 6; // Size of the heart
            
        // Upper part of the heart 
        for (int i =3; i <= n; i += 2) {
            // Print leading spaces
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }

            // Print the first half of the upper part (hollow)
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
    }
}
}
