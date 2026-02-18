public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example based on the prompt)
        int number = 8; 

        // Check if the number is a cube
        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }



        // Additional examples for testing (optional):
        checkAndPrint(27); // Cube
        checkAndPrint(30); // Not a cube
        checkAndPrint(1000);  //Cube
        checkAndPrint(-8);   // Cube (of -2)
        checkAndPrint(0);    // Cube (of 0)

    }

    // Efficient method to check if a number is a perfect cube
    public static boolean isCube(int num) {
        double cubeRoot = Math.cbrt(num); // Calculate cube root
        return Math.round(cubeRoot) * Math.round(cubeRoot) * Math.round(cubeRoot) == num;
    }




     // Helper method for printing the results (optional - for cleaner main)
    public static void checkAndPrint(int n) {
        if (isCube(n)) {
            System.out.println(n + " is a cube.");
        } else {
            System.out.println(n + " is not a cube.");
        }
    }
}
