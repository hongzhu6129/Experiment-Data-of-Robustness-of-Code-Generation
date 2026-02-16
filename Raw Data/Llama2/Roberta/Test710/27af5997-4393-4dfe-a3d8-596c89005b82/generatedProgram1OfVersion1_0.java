public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example, ideally would be read from user input)
        int number = 8;

        // Check if the number is a perfect cube
        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        // Test with other numbers
        number = 27;  // Cube of 3
        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

        number = 30; // Not a perfect cube
        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

         number = -27;  // Cube of -3
        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

    }

    private static boolean isCube(int num) {
        // Efficiently handle both positive and negative numbers:

        //Using cbrt (cube root)
        double cubeRoot = Math.cbrt(num);  // Calculate the cube root

        //Check if cubeRoot is an integer
        return (cubeRoot == Math.round(cubeRoot)); // Clever check to see if it's a whole number
    }
}
