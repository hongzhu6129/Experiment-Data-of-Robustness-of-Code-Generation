public class CubeChecker {

    public static void main(String[] args) {
        // Input handling (simplified for demonstration)
        int number = 8; // Replace with user input if needed

        // Check if the number is a perfect cube
        if (isPerfectCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }


    private static boolean isPerfectCube(int number) {
        // Handle negative numbers (cubes can be negative)
        if (number < 0) {
            return isPerfectCube(-number); // Check the absolute value
        }

        // Efficiently check for perfect cube using Math.cbrt
        double cubeRoot = Math.cbrt(number);  // Calculate cube root
        return cubeRoot == (int) cubeRoot; // Check if the cube root is an integer
    }
}
