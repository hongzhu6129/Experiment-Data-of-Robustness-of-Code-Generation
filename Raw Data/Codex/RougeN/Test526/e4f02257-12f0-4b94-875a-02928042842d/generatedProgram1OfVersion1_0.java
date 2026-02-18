public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example based on the prompt)
        int num = 8;

        // Check if the number is a perfect cube
        if (isPerfectCube(num)) {
            System.out.println("Number is a honeycomb."); // Using the prompt's terminology
        } else {
            System.out.println("Number is not a honeycomb."); // Using the prompt's terminology
        }


        // Example with different inputs (you could uncomment these for testing):
        // checkCube(27); // Output: Number is a honeycomb.
        // checkCube(10); // Output: Number is not a honeycomb.
        // checkCube(-8); // Output: Number is a honeycomb. (Handles negative cubes).

    }



    private static boolean isPerfectCube(int num) {
        // Efficiently handles both positive and negative cubes.
        double cubeRoot = Math.cbrt(num);
        return Math.round(cubeRoot) * Math.round(cubeRoot) * Math.round(cubeRoot) == num;
    }


}
