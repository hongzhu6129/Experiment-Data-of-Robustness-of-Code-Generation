public class CubeChecker {

    public static void main(String[] args) {
        // Input data (for testing within main method)
        int number = 8; // Replace with user input if needed

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }


    private static boolean isCube(int num) {
        if (num < 0) {  // Handle negative numbers (their cubes are also negative)
            return isCube(-num);
        }


        int cubeRoot = (int) Math.round(Math.cbrt(num)); // Calculate cube root

        return cubeRoot * cubeRoot * cubeRoot == num; // Check if the cube of the integer cube root equals the original number

    }
}
