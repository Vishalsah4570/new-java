public class SelectionSort@ {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        // Print original array
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int n = arr.length;

        // Selection sort logic without a function
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
