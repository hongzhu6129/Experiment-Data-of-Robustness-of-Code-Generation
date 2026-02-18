public class CubeChecker {

    public static void main(String[] args) {
        // Input data (replace with user input if needed)
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

        //Efficiently check if a number is a perfect cube
        int cbrt = (int) Math.round(Math.cbrt(num)); // Calculate the cube root and round to the nearest integer
        return cbrt * cbrt * cbrt == num;       // Check if the cube of the cube root equals the original number
    }
}
