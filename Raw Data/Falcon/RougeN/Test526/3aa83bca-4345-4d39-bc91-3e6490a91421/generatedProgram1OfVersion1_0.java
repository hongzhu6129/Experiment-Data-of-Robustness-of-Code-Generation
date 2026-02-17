public class CubeChecker {

    public static void main(String[] args) {
        // Input handling (replace with more robust input if needed)
        int number = 8; // Example input, replace with user input or command-line args

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isCube(int n) {
        // Handle negative numbers (their cubes are negative)
        if (n < 0) {
            return isCube(-n);  // Check the absolute value
        }

        // Efficiently check for cubes using Math.cbrt() and comparing with its integer part
        double cubeRoot = Math.cbrt(n);
        return (int) cubeRoot * (int) cubeRoot * (int) cubeRoot == n; 

    }
}
