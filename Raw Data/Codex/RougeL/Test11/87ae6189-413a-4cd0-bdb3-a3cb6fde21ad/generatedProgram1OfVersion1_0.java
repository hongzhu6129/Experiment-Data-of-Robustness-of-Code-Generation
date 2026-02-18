public class CubeChecker {

    public static void main(String[] args) {
        // Input (hardcoded for this example, ideally would be read from user input)
        int number = 8;

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        // Additional test cases (optional, for demonstration)
        checkCube(27);  // Output: Number is a cube.
        checkCube(10);  // Output: Number is not a cube.
        checkCube(0);  // Output: Number is a cube.
        checkCube(-8); // Output: Number is a cube.
        checkCube(-26); // Output: Number is not a cube.

    }

    // Helper function to check if a number is a cube
    private static boolean isCube(int n) {
        // Handle negative numbers (they can be perfect cubes too)
        if (n < 0) {
            n = -n; // Take the absolute value to work with positive values
            // We negate the result of cbrt because if n is a negative cube, its cube root should also be negative
            return Math.cbrt(n) == -(int)Math.cbrt(n); 

        } else { // For positive numbers or zero
           return Math.cbrt(n) == (int)Math.cbrt(n);

        }

    }


    // Alternative simpler way to print the result (optional)
    private static void checkCube(int num) {
        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

}
