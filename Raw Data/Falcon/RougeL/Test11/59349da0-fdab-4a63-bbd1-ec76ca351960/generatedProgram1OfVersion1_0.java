public class CubeChecker {

    public static void main(String[] args) {
        // Input data (replace with user input if needed)
        int num = 8; 

        // Check if the number is a perfect cube
        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isCube(int num) {
        // Handle negative numbers (cubes of negative numbers are negative)
        if (num < 0) {
            return isCube(-num); // Check the absolute value
        }

        // Efficiently check if the cube root is an integer
        int cubeRoot = (int) Math.round(Math.cbrt(num)); // Calculate cube root and round to nearest integer

        return cubeRoot * cubeRoot * cubeRoot == num; // Verify if the cube of the root equals the original number
    }
}
