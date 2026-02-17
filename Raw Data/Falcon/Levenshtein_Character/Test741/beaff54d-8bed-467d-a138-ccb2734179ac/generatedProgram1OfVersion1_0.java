public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example, could be read from user input)
        int num = 8; 

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        // Example with a different number
        num = 27; 

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

         // Example with a non-cube number:
        num = 10;

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

        // Example with a negative number:
         num = -27;

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

        // Example with zero
        num = 0;

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }


    private static boolean isCube(int num) {
        // Handle negative numbers:
        if (num < 0) {
            return isCube(-num); // Check if the absolute value is a cube 
        }
        
        // Efficient approach using Math.cbrt (cube root)
         double cubeRoot = Math.cbrt(num);
        return cubeRoot == (int) cubeRoot; // Check if cube root is an integer.

    }
}
