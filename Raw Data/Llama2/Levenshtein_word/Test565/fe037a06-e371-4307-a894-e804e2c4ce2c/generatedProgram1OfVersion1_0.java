public class CubeChecker {

    public static void main(String[] args) {
        // Input (hardcoded for this example, ideally you would take user input)
        int number = 8; 

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        // Test with another number
        number = 27; 

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


         // Test with a non-cube
        number = 10; 

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


    }

    private static boolean isCube(int num) {
        if (num < 0) {  // Handle negative numbers (their cubes are also negative)
             return isCube(-num); // Recursively check the absolute value
        }


         // Efficient approach: Check if the cube root is an integer.
        double cubeRoot = Math.cbrt(num);  // Calculate the cube root
        return Math.round(cubeRoot) * Math.round(cubeRoot) * Math.round(cubeRoot) == num;

    }
}
