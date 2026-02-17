public class CubeChecker {

    public static void main(String[] args) {
        // Input number (replace with user input if needed)
        int num = 8; 

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isCube(int num) {
        if (num < 0) { // Handle negative numbers by checking the cube of their absolute value
            return isCube(-num);  // Or return false directly if negative cubes are not allowed
        }
        int cubeRoot = (int) Math.round(Math.cbrt(num)); // Calculate the cube root and round to the nearest integer
        return cubeRoot * cubeRoot * cubeRoot == num;     // Check if the cube of the root equals the original number
    }
}
