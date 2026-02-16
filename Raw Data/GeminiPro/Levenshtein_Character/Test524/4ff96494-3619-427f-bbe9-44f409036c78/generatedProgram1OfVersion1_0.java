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

        // Example with user input (commented out as the prompt specifies hardcoded input)
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


    // Helper function to check if a number is a perfect cube
    private static boolean isPerfectCube(int num) {
        // Handle negative numbers (their cube root will be negative)
         if (num < 0) {
             return isPerfectCube(-num);
         }
        int cubeRoot = (int) Math.round(Math.cbrt(num)); // Calculate the cube root
        return cubeRoot * cubeRoot * cubeRoot == num;    // Check if the cube of the root equals the original number
    }
}
