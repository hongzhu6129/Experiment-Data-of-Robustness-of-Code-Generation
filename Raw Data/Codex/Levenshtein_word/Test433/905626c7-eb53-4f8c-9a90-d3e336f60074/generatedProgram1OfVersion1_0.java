public class CubeChecker {

    public static void main(String[] args) {
        // Input number (replace with user input or other methods as needed)
        int number = 8; 

        // Check if the number is a perfect cube
        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

        // Example with other inputs:
        checkCube(27);  // Output: Number is a cube.
        checkCube(10);  // Output: Number is not a cube.
        checkCube(-8); // Output: Number is a cube.
    }



    // Efficient method to check if a number is a perfect cube
    private static boolean isCube(int n) {
        if (n < 0) { // Handle negative numbers (cubes can be negative)
            n = -n;
        }

        // Binary search for cube root
        long low = 0;
        long high = n;

        while (low <= high) {
            long mid = low + (high - low) / 2;  // Avoid potential overflow
            long cube = mid * mid * mid;

            if (cube == n) {
                return true;
            } else if (cube < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }


    // Alternative method (less efficient for large numbers but simpler) for demonstration
    private static void checkCube(int num) {
         double cubeRoot = Math.cbrt(num);
        if (cubeRoot == Math.round(cubeRoot)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }
}
