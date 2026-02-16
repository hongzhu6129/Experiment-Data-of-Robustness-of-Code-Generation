public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example, you can use Scanner for user input)
        int number = 8; 

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        // Additional test cases (optional)
        testCube(27);  // Cube
        testCube(30);  // Not a cube
        testCube(-8); // Cube
        testCube(0);  // Cube
        testCube(1);  // Cube
    }


    // Helper function to check if a number is a perfect cube
    private static boolean isCube(int num) {
        // Handle negative numbers and zero
        if (num < 0) {
           return isCube(-num); // Check the absolute value
        }
        if (num == 0) return true;
        
        int root = (int) Math.round(Math.cbrt(num)); // Calculate cube root 
        return root * root * root == num;   // Check if the cube of the root is equal to the number
    }


    // Helper function for testing (optional)
    private static void testCube(int num) {
        if (isCube(num)) {
            System.out.println(num + " is a cube.");
        } else {
            System.out.println(num + " is not a cube.");
        }
    }

}
