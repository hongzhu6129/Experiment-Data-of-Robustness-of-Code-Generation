public class CubeChecker {

    public static void main(String[] args) {
        // Input data (for testing within main method)
        int num = 8; 

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }



        // Example with user input (requires exception handling):
        /*  Scanner scanner = new Scanner(System.in);
            System.out.print("Input a number: ");
            try {
                int inputNum = scanner.nextInt();
                if (isCube(inputNum)) {
                    System.out.println("Number is a cube.");
                } else {
                    System.out.println("Number is not a cube.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
            scanner.close();
        */ 
    }

    private static boolean isCube(int num) {
        // Handle negative numbers (their cubes are negative)
        if (num < 0) {
            return isCube(-num);  // Check the absolute value
        }


        // Efficient approach using cubic root
        int cubeRoot = (int) Math.round(Math.cbrt(num));
        return cubeRoot * cubeRoot * cubeRoot == num;



        // Less efficient loop-based approach (for demonstration)
       /* for (int i = 0; i <= num; i++) {  // Loop can be optimized, but kept simple for clarity
            if (i * i * i == num) {
                return true;
            } else if (i * i * i > num) { // Optimization: Stop if we've exceeded the number
                break;  
            }
        }
        return false; */ 
    }
}
