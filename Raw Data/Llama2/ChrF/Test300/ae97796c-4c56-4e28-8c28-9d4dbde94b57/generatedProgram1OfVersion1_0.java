public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example based on the prompt)
        int num = 8;

        // Check if the number is a perfect cube
        if (isPerfectCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }


    private static boolean isPerfectCube(int num) {
        // Handle negative numbers.
        if (num < 0) {
            return isPerfectCube(-num); // Check absolute value for negative cubes.
        }

        // Efficient approach using Math.cbrt (cube root)
        double cubeRoot = Math.cbrt(num);
        return cubeRoot == Math.round(cubeRoot); // Check if the cube root is an integer
    }
}
