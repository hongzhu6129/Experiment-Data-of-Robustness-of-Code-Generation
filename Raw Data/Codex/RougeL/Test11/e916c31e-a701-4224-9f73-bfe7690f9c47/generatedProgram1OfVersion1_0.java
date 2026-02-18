public class CubeChecker {

    public static void main(String[] args) {
        // Input number (replace with user input if needed)
        int number = 8; 

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isCube(int number) {
        // Handle negative numbers (their cubes are negative)
        if (number < 0) {
             return isCube(-number);  // Check the absolute value
        }

        // Efficiently check for cubes using integer arithmetic 
        int cubeRoot = (int) Math.round(Math.cbrt(number)); // Calculate the integer cube root
        return cubeRoot * cubeRoot * cubeRoot == number;     // Check if the cube of the root is the original number
    }
}
