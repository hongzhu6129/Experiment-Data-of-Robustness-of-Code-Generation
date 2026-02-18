public class CubeChecker {

    public static void main(String[] args) {
        // Input data (replace with user input if needed)
        int number = 8; 

        // Check if the number is a perfect cube
        if (isPerfectCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isPerfectCube(int num) {
        // Handle negative numbers (their cube root will be negative)
        if (num < 0) {
             return isPerfectCube(-num); // Check the absolute value
        }

        // Efficiently calculate the cube root using Math.cbrt()
        double cubeRoot = Math.cbrt(num);
        
        // Check if the cube root is an integer
        return cubeRoot == (int) cubeRoot;
    }
}
