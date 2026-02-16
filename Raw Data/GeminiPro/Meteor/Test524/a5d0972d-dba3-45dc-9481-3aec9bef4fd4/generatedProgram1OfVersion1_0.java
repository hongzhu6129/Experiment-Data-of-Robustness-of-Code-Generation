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


        // Example with user input (commented out as the question specifically asks for main method only)
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();

        if (isPerfectCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
        scanner.close();
        */
    }



    private static boolean isPerfectCube(int num) {
        // Handle negative numbers (cube root of a negative number is negative)
        if (num < 0) {
           return isPerfectCube(-num); // Check the absolute value
        }

        //Efficiently check for perfect cube using cubic root and rounding
        int cubeRoot = (int) Math.round(Math.cbrt(num)); // Calculate the cube root and round to the nearest integer

        return cubeRoot * cubeRoot * cubeRoot == num; // if the cube of the rounded cube root is equal to original number.

    }
}
