public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example, could be read from user input)
        int num = 8; 

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isCube(int num) {
        if (num < 0) { // Handle negative numbers by checking the cube of their absolute value
            return isCube(-num); 
        } else if (num == 0) {
             return true; // 0 is a perfect cube
        }

        // Efficiently check for perfect cube using integer arithmetic
        int cubeRoot = Math.round(Math.cbrt(num));  // Calculate the integer cube root
        return cubeRoot * cubeRoot * cubeRoot == num; // Check if the cube of the integer root equals the original number

    }
}
