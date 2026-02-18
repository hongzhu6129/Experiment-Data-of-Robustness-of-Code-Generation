public class CubeChecker {

    public static void main(String[] args) {
        // Input data (replace with user input if needed)
        int number = 8; 

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isCube(int n) {
        if (n < 0) {  // Handle negative numbers (their cubes are negative)
            return isCube(-n); // Check the absolute value and return the opposite
        } else if (n == 0) {
            return true; // 0 is a cube
        }

        // Efficiently check for perfect cube using integer arithmetic
        int root = Math.round(Math.cbrt(n));  // Calculate the cube root and round to nearest int

        return (root * root * root) == n;     // Check if the cube of the root equals the number
    }
}
