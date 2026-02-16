public class CubeChecker {

    public static void main(String[] args) {
        // Input data (replace with user input if needed)
        int num = 8; 

        // Check if the number is a perfect cube
        if (isPerfectCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isPerfectCube(int num) {
        // Handle negative numbers (their cubes are negative)
        if (num < 0) {
            return isPerfectCube(-num); // Check the absolute value
        }

        // Efficiently check for perfect cubes using a cubic root calculation 
        int cubeRoot = (int) Math.round(Math.cbrt(num)); // Calculate the cubic root and round to the nearest integer

        return cubeRoot * cubeRoot * cubeRoot == num; // Check if the cube of the root is equal to the original number

    }
}
