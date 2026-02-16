public class CubeChecker {

    public static void main(String[] args) {
        // Input data (replace with user input if needed)
        int number = 8; 

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isCube(int num) {
        if (num < 0) {
            return isCube(-num); // Handle negative numbers (their cubes are negative)
        } else if (num == 0) {
            return true; // 0 is a cube (0*0*0)
        }


        // Efficiently check for cubes using Math.cbrt (cube root)
        double cubeRoot = Math.cbrt(num);
        return Math.round(cubeRoot) * Math.round(cubeRoot) * Math.round(cubeRoot) == num;


    }
}
