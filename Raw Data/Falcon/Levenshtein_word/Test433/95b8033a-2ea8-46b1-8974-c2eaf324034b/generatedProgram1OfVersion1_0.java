public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example, ideally would be taken from user input)
        int number = 8;

        // Check if the number is a perfect cube
        if (isPerfectCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

        // Test with other numbers (optional)
        testCube(27);  // Cube of 3
        testCube(64);  // Cube of 4
        testCube(125); // Cube of 5
        testCube(100); // Not a cube
        testCube(-8);  // Cube of -2
        testCube(0);   // Cube of 0


    }

    private static boolean isPerfectCube(int num) {
        // Handle negative numbers: the cube root of a negative number is negative
        if (num < 0) {
            return isPerfectCube(-num); // Check the absolute value
        }
        
        //Efficiently calculate the cube root by using cbrt (cube root) function
        double cubeRoot = Math.cbrt(num);
        
        //Check if the cube root is an integer
        return cubeRoot == (int) cubeRoot; 
    }
    
    private static void testCube(int num) {
        if (isPerfectCube(num)) {
            System.out.println(num + " is a cube.");
        } else {
            System.out.println(num + " is not a cube.");
        }
    }
}
