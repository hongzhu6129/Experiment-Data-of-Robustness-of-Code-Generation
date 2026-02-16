public class CubeChecker {

    public static void main(String[] args) {
        // Input handling (replace with your preferred input method, e.g., Scanner)
        int num = 8; // Example input, replace with actual input

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }


    private static boolean isCube(int num) {
        if (num < 0) { // Handle negative numbers
            return isCube(-num); // Recursively check the absolute value
        }
        if (num == 0) {
            return true; // 0 is a cube
        }

        double cubeRoot = Math.cbrt(num);
        return Math.round(cubeRoot) * Math.round(cubeRoot) * Math.round(cubeRoot) == num;
    }
}
