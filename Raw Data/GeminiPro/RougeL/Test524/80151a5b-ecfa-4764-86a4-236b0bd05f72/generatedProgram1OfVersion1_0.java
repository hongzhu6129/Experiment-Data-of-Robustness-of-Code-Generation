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

    private static boolean isCube(int num) {
        // Handle negative numbers (their cubes are negative)
        if (num < 0) {
            return isCube(-num); // Check the absolute value
        }

        // Efficiently check for cubes using a cubic root approximation
        int cbrt = (int) Math.round(Math.cbrt(num));  // Calculate cube root
        return cbrt * cbrt * cbrt == num;     // Check if the cube of cbrt matches num
    }
}
