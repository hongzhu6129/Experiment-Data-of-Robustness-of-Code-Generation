public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example, ideally would be read from user input)
        int number = 8;

        // Check if the number is a perfect cube
        if (isPerfectCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube."); 
        }
    }

    private static boolean isPerfectCube(int num) {
        // Handle negative numbers (cube root of a negative number is negative)
        if (num < 0) {
           return isPerfectCube(-num); // Check the absolute value
        }

        // Efficiently check for perfect cube using Math.cbrt (cube root) and casting
        double cubeRoot = Math.cbrt(num);
        return (int) cubeRoot == cubeRoot; // Check if cube root is an integer
    }
}
