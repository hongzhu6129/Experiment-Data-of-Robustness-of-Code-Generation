public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for demonstration, ideally would be read from user input)
        int num = 8;

        // Check if the number is a cube
        boolean isCube = checkCube(num);

        // Output the result
        if (isCube) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        // Test with other values (for demonstration)
        testCube(27);  // Cube
        testCube(30);  // Not a cube
        testCube(-8);  // Cube
        testCube(0);   // Cube
        testCube(1);   // Cube

    }

    private static boolean checkCube(int num) {
        // Efficient method using cubic root calculation
        double cubeRoot = Math.cbrt(num);
        return cubeRoot == Math.round(cubeRoot); // Check if the cube root is an integer

    }

    private static void testCube(int num) { //Helper function just for testing different values
        boolean isCube = checkCube(num);
        if (isCube) {
            System.out.println(num + " is a cube.");
        } else {
            System.out.println(num + " is not a cube.");
        }

    }
}
