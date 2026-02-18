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

    private static boolean isPerfectCube(int n) {
        if (n < 0) {
            return isPerfectCube(-n); // Handle negative numbers by checking the absolute value
        }

        // Efficiently check for perfect cubes using cubic root calculation
        double cubeRoot = Math.cbrt(n);
        return Math.round(cubeRoot) * Math.round(cubeRoot) * Math.round(cubeRoot) == n;
    }
}
