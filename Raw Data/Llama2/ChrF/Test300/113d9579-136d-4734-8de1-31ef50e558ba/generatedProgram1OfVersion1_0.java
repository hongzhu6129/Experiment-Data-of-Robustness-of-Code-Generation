public class CubeChecker {

    public static void main(String[] args) {
        // Input data (you can modify this to take input from the user)
        int num = 8; 

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isCube(int num) {
        // Handle negative numbers (their cubes are negative)
        if (num < 0) {
            return isCube(-num); // Check the absolute value
        }


        // Efficiently check for cubes using integer cube root approximation
        int cubeRoot = (int) Math.round(Math.cbrt(num)); 

        return cubeRoot * cubeRoot * cubeRoot == num;


    }
}
