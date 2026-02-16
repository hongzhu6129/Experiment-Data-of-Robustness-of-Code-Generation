public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for demonstration, you can modify to take user input)
        int num = 8;

        // Check if the number is a perfect cube
        boolean isCube = isPerfectCube(num);

        // Output the result
        if (isCube) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

        // Test with other values:
        testCube(27); // Cube
        testCube(1000); // Cube
        testCube(30);   // Not a cube
        testCube(-8); // Cube (handles negative numbers correctly)

    }

    // Helper function to determine if a number is a perfect cube
    private static boolean isPerfectCube(int num) {
        double cubeRoot = Math.cbrt(num);
        return cubeRoot == (int) cubeRoot;  // Check if the cube root is an integer
    }



    // Helper function for testing to make outputs clear.
    private static void testCube(int num) {
        if (isPerfectCube(num)) {
            System.out.println(num + " is a cube.");
        } else {
            System.out.println(num + " is not a cube.");
        }
    }
}
