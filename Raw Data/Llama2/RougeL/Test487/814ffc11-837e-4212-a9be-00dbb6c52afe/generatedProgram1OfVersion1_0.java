public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example as per the prompt)
        int number = 8;

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

        // Example with user input (using Scanner -  remove if not desired given the prompt)
        //  Keep this commented out if strict adherence to only main method is required.
         /*
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
        scanner.close();
        */
    }

    private static boolean isCube(int num) {
        // Handle negative numbers:
        if (num < 0) {
            return isCube(-num); // Check if the absolute value is a cube
        }

        // Efficiently check if a number is a perfect cube using Math.cbrt (cube root)
        double cubeRoot = Math.cbrt(num);
        return cubeRoot == (int) cubeRoot; // Check if the cube root is an integer.


        // Alternatively, a less efficient (but still workable) method without Math.cbrt:
        // int i = 1;
        // while (i * i * i < num) {
        //     i++;
        // }
        // return i * i * i == num;
    }
}
