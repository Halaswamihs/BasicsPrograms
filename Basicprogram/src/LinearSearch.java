public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 9, 10, 11, 15};
        int key = 11;
        linearSearch(arr, key);
    }

    public static void linearSearch(int[] arr, int key) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element is found: " + key + " at index " + i);
                found = true;
                break; // Exit the loop after finding the key
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }
}
