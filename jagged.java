// Class demonstrating the usage of jagged arrays in Java
public class jagged {
    public static void main(String[] args) {
        // Declare a jagged array with 3 rows
        int jag[][] = new int[3][];
        // Initialize the first row with 3 columns
        jag[0] = new int[3];
        // Initialize the second row with 4 columns
        jag[1] = new int[4];
        // Initialize the third row with 5 columns
        jag[2] = new int[5];

        // Fill and print the jagged array using nested for-loops
        for (int i = 0; i < jag.length; i++) {
            for (int j = 0; j < jag[i].length; j++) {
                // Generate random integers between 0 and 9 and assign to array elements
                jag[i][j] = (int) (Math.random() * 10);
                // Print each element of the jagged array
                System.out.print(jag[i][j] + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }

        // Add a newline for better separation in the output
        System.out.println();

        // Alternative method: Fill the jagged array with random integers and print using enhanced for-loops
        for (int[] n : jag) {
            for (int m : n) {
                // Generate random integers between 0 and 9 and print each element
                m = (int) (Math.random() * 10);
                System.err.print(m + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
