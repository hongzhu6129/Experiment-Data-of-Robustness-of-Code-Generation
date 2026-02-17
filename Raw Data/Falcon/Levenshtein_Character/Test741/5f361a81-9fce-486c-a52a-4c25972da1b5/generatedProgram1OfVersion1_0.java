public class CubeChecker {

    public static void main(String[] args) {
        // Input number (replace with user input if needed)
        int num = 8; // Example input

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        // Example with another number
        num = 27;
        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
        
         // Example with a negative number
        num = -8;
        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        num = 10;
        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isCube(int num) {
        // Handle negative numbers (cube root can be negative)
        double cubeRoot = Math.cbrt(num); 

        // Check if the cube root is an integer by comparing it to its rounded value
        return Math.round(cubeRoot) == cubeRoot; 
    }
}
