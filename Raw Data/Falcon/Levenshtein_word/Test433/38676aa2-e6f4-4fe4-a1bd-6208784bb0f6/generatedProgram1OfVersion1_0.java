public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example as per prompt)
        int number = 8;

        // Check if the number is a perfect cube
        if (isPerfectCube(number)) {
            System.out.println("number is a cube.");
        } else {
            System.out.println("number is not a cube."); // Added for completeness
        }
    }

    // Helper function to check for perfect cube
    private static boolean isPerfectCube(int n) {
        if (n < 0) { // Handle negative numbers (cube root can be negative)
            return isPerfectCube(-n); // Check the absolute value
        } else if (n == 0) {
            return true; // 0 is a perfect cube
        }
        
        double cubeRoot = Math.cbrt(n);
        return Math.round(cubeRoot) * Math.round(cubeRoot) * Math.round(cubeRoot) == n;

    }
}
