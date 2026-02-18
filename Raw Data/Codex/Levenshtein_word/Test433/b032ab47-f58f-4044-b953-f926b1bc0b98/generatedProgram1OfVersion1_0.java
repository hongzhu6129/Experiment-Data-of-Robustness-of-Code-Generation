public class CubeChecker {

    public static void main(String[] args) {
        // Input handling (replace with your preferred method, e.g., Scanner)
        int num = 8; // Example input, replace with user input
        

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

    }

    // Helper function to check if a number is a perfect cube
    private static boolean isCube(int num) {
        if (num < 0) {  // Handle negative numbers: cube root will be negative
           return isCube(-num);
        }

        double cubeRoot = Math.cbrt(num);  // Calculate the cube root
        return Math.round(cubeRoot) * Math.round(cubeRoot) * Math.round(cubeRoot) == num;  //Check if cube root is integer and its cube is original
    }
}
