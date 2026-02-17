public class CubeChecker {

    public static void main(String[] args) {
        // Input data (for testing purposes, replace with user input if needed)
        int number = 8; 

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isCube(int number) {
        if (number < 0) {  // Handle negative numbers (cubes can be negative)
            return isCube(-number); // Check the absolute value 
        }

        // Efficiently check for perfect cubes using a cubic root calculation and check for integer result
        double cubeRoot = Math.cbrt(number);
        return Math.round(cubeRoot) == cubeRoot;


        /*  Alternative method (less efficient, iterative)
        for (int i = 1; i*i*i <= number; i++) {
            if (i*i*i == number) {
                return true;
            }
        }
        return false;
        */
    }
}
