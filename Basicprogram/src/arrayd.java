public class arrayd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4}; // Input array with duplicates
        
        int newSize = removeDuplicates(arr, 0, 1); // Start recursion
        
        // Print the unique elements
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr, int d, int i) {
        if (i == arr.length) return d + 1; // Base case: return new size

        if (arr[i] != arr[d]) { // If new unique element found
            d++;
            arr[d] = arr[i]; // Move it forward
        }

        return removeDuplicates(arr, d, i + 1); // Recursive call
    }
}
