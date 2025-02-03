public class arrayrotate {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print Original Matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Rotate the matrix by 90° clockwise (in-place)
        for (int i = 0; i < 3 / 2; i++) {
            for (int j = i; j < 3 - i - 1; j++) {
                // Four-way swap
                int temp = matrix[i][j];  // Store top

                // Move left → top
                matrix[i][j] = matrix[3 - j - 1][i];

                // Move bottom → left
                matrix[3 - j - 1][i] = matrix[3 - i - 1][3 - j - 1];

                // Move right → bottom
                matrix[3 - i - 1][3 - j - 1] = matrix[j][3 - i - 1];

                // Move temp (original top) → right
                matrix[j][3 - i - 1] = temp;
            }
        }

        // Print Rotated Matrix
        System.out.println("\nRotated Matrix (90° Clockwise):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
