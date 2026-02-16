public class CubeChecker {

    public static void main(String[] args) {
        // Input (hardcoded for this example as per problem description)
        int num = 8; 

        // Check if the number is a perfect cube
        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        // Example with different inputs (you can uncomment these to test):
         checkCube(27); // Output: Number is a cube.
         checkCube(10); // Output: Number is not a cube.
         checkCube(-8); // Output: Number is a cube.
         checkCube(0);  // Output: Number is a cube.


    }


    // Helper function to check if a number is a perfect cube
    private static boolean isCube(int num) {
        // Handle negative numbers (cube root of a negative is also negative)
        int absNum = Math.abs(num); 

        // Efficiently check for cubes using integer arithmetic 
        // (avoids floating-point inaccuracies).
        for (int i = 0; i <= Math.cbrt(absNum); i++) {
            if (i * i * i == absNum) {
                return true;
            }
        }
        return false;
    }


    //  Alternative method (demonstrates handling input directly in main)
    public static void checkCube(int num) {

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }
}

