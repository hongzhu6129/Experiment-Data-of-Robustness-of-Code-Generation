public class CubeChecker {

    public static void main(String[] args) {
        // Input data (for testing within main method)
        int number = 8; 

        // Check if the number is a cube
        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        // Test with other inputs (within main method)
        number = 27;
        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

        number = 10;
        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


         number = 0; // Test edge case
        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        number = -8; // Test negative number
        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

    }


    // Helper function to check if a number is a perfect cube
    private static boolean isCube(int n) {
        // Handle negative numbers (cube root of a negative number is negative)
        int absN = Math.abs(n);

        // Binary search for the cube root.  More efficient for large numbers.
        int low = 0;
        int high = (int) Math.cbrt(Integer.MAX_VALUE); // Efficiently handle large numbers

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid overflow
            int cube = mid * mid * mid;

            if (cube == absN) {
               return n >=0 ? true: (n == -cube) ; //Check sign for negative numbers
            } else if (cube < absN) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false; // No cube root found
    }
}
