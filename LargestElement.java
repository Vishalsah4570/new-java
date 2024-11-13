public class LargestElement {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {9, 5, 6}, {7, 8, 4}};
        int max = array[0][0];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        
        System.out.println("Largest element: " + max);
    }
}
