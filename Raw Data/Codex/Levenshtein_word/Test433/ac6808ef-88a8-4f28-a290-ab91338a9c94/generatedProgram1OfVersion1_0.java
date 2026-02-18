public class CubeChecker {

    public static void main(String[] args) {
        // Input (for simplicity, we'll hardcode the input as in the example. For real user input, use Scanner)
        int number = 8; 

        // Check if the number is a perfect cube
        if (isPerfectCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isPerfectCube(int n) {
        // Handle negative numbers:  The cube root of a negative number is real and negative.
        if (n < 0) {
            return isPerfectCube(-n);  // Check the absolute value
        }

        // Efficient method using cubic root: cbrt() requires Java 9 or later
        //double cubeRoot = Math.cbrt(n);
        //return cubeRoot == (int) cubeRoot;

        // Method compatible with older Java versions:
        int root = (int) Math.round(Math.pow(n, 1.0/3.0)); // Calculate the integer part of cube root
        return n == root * root * root;
    }
}
