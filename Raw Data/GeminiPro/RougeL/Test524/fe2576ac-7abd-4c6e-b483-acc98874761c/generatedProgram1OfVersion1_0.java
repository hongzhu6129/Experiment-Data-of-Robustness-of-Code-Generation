public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example based on the prompt)
        int num = 8; 

        // Check if the number is a perfect cube
        if (isPerfectCube(num)) {
            System.out.println("Number is same cube."); // Output as requested in the prompt
        } else {
            System.out.println("Number is not a perfect cube.");
        }
    }

    private static boolean isPerfectCube(int num) {
        // Handle negative numbers
        if (num < 0) {
            return isPerfectCube(-num); // Check the absolute value and negate the result
        }


        int cubeRoot = (int) Math.round(Math.cbrt(num)); // Calculate the cube root

        return cubeRoot * cubeRoot * cubeRoot == num;  // Efficiently check if it's a perfect cube
    }
}
