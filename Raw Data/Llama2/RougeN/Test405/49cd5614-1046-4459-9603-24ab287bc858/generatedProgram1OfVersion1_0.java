public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example based on prompt)
        int number = 8;

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        // Example with user input (requires exception handling)
         java.util.Scanner scanner = new java.util.Scanner(System.in);
         System.out.print("Input a number: ");

         if (scanner.hasNextInt()) {
             int userNum = scanner.nextInt();
             if (isCube(userNum)) {
                 System.out.println("Number is a cube.");
             } else {
                 System.out.println("Number is not a cube.");
             }
         } else {
             System.out.println("Invalid input. Please enter an integer.");
         }
         scanner.close();
    }




    private static boolean isCube(int num) {
        // Handle negative numbers (their cubes are also negative)
        if (num < 0) {
            return isCube(-num); // Check the absolute value
        }

        // Efficiently check for cube using cbrt (cube root)
        double cubeRoot = Math.cbrt(num);
        return Math.round(cubeRoot) * Math.round(cubeRoot) * Math.round(cubeRoot) == num;
    }
}
