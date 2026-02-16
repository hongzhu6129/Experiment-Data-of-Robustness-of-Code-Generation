public class CubeChecker {

    public static void main(String[] args) {
        // Input data (for testing within main method)
        int number = 8; 

        // Check if the number is a cube
        if (isCube(number)) {
            System.out.println(number + " is a cube.");
        } else {
            System.out.println(number + " is not a cube.");
        }


        // Additional test cases within main (optional)
        testCube(27);  // Output: 27 is a cube.
        testCube(30);  // Output: 30 is not a cube.
        testCube(0);   // Output: 0 is a cube.
        testCube(-8);  // Output: -8 is a cube. 
        testCube(-26); // Output: -26 is not a cube.
    }

    // Helper function to check if a number is a cube
    private static boolean isCube(int n) {
        if (n == 0) return true; // 0 is a cube of itself

        // Handle negative numbers
        if (n < 0) {
            n = -n;  // Make n positive for calculation

            for (int i = 1; i <= Math.cbrt(n); i++) {
                if (i * i * i == n) {
                    return true; // Negative number is a cube
                }
            }

            return false; // Negative number is not a cube

        }

        // Handle positive numbers
        for (int i = 1; i <= Math.cbrt(n); i++) { // Optimized to check up to the cube root
           if (i * i * i == n) {
                return true;
            }
        }

       return false;

    }

    // Helper function to test and print results for different numbers
    private static void testCube(int n) {
        if (isCube(n)) {
            System.out.println(n + " is a cube.");
        } else {
            System.out.println(n + " is not a cube.");
        }
    }
}
