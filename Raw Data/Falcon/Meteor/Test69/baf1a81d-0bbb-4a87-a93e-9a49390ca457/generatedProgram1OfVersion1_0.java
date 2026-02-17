public class CubeChecker {

    public static void main(String[] args) {
        // Input number (for testing purposes, we'll hardcode it.  
        // In a real application, you'd use a Scanner to get input from the user).
        int num = 8;  // Replace 8 with any number you want to test

        // Check if the number is a perfect cube
        if (isPerfectCube(num)) {
            System.out.println("Number is a cube."); // Changed from "honeycomb" to "cube"
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    // Helper function to check if a number is a perfect cube
    private static boolean isPerfectCube(int num) {
        // Handle negative numbers (cubes of negative numbers are negative)
        if (num < 0) {
           return isPerfectCube(-num);  // Check the absolute value for negative inputs
        }


        // Efficiently find the cube root (integer part) using cbrt 
        int cubeRoot = (int) Math.cbrt(num);  // cbrt returns a double; we cast to int


        // Check if the cube of the integer cube root is equal to the original number
        return cubeRoot * cubeRoot * cubeRoot == num; 
    }
}
