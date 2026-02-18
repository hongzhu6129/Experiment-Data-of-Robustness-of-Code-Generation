public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example based on the prompt)
        int number = 8;

        // Check if the number is a perfect cube
        boolean isCube = checkIfCube(number);

        // Output the result
        if (isCube) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        // Example with user input (using Scanner - requires exception handling)
        //  This is just an example and not strictly part of the prompt's request.
        /*
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Input a number: ");
        try {
            int num = scanner.nextInt();
            if (checkIfCube(num)) {
                System.out.println("Number is a cube.");
            } else {
                System.out.println("Number is not a cube.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close(); */ // Important to close the Scanner
    }




    private static boolean checkIfCube(int number) {
        // Handle negative numbers (cube root of a negative number is negative)
        if (number < 0) {
            return checkIfCube(-number); // Check the absolute value
        }

        // Efficiently check if it's a perfect cube using cbrt()
        double cubeRoot = Math.cbrt(number);
        return Math.round(cubeRoot) * Math.round(cubeRoot) * Math.round(cubeRoot) == number;


        // Less Efficient Alternatives (avoid these):

        // Brute force approach (iterating through possible cube roots):
        /* for (int i = 0; i * i * i <= number; i++) {  
            if (i * i * i == number) {
                return true;
            }
        }
        return false;*/

        // Using a cubic root calculation and checking for integer result (less efficient due to floating-point precision issues): 
       /*  double cbrt = Math.cbrt(number);
        return cbrt == (int) cbrt;  // This has floating-point comparison problems and is not recommended*/

    }
}
