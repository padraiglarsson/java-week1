public class Exercise5 {
    public static void main(String[] args) {

        // Declare and initialize a 2D array named 'numbers' with three rows of varying column lengths
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };

        // Print the value at the specified index [1][3] in the 'numbers' array
        // Note: This index refers to the second row (index 1) and the fourth element (index 3) in that row.
        System.out.println(numbers[1][3]);

        // Print the value at the specified index [2][1] in the 'numbers' array
        // Note: This index refers to the third row (index 2) and the second element (index 1) in that row.
        System.out.println(numbers[2][1]);
    }
}

