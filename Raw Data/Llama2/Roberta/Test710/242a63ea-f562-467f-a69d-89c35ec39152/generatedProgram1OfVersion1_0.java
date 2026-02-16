public class CubeChecker {

    public static void main(String[] args) {
        // Input (replace with user input if needed)
        int number = 8; 

        // Check if the number is a perfect cube
        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isCube(int number) {
        // Handle negative numbers (cubes of negative numbers are negative)
        if (number < 0) {
             return isCube(-number); // Check the absolute value
        }

        // Efficient approach: Check if the cube root is an integer
        double cubeRoot = Math.cbrt(number);  // Calculate cube root

         return Math.round(cubeRoot) * Math.round(cubeRoot) * Math.round(cubeRoot) == number;
        
    }
}
