public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example based on prompt)
        int num = 8; 

        // Check if the number is a perfect cube
        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        // Example with user input (requires exception handling in a real application)
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num2 = scanner.nextInt();

        if (isCube(num2)) {
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
           return isCube(-num);  // Check the absolute value for negative cubes
        }

        // Efficient approach: Check cube root.
        int cubeRoot = (int) Math.round(Math.cbrt(num));
        return cubeRoot * cubeRoot * cubeRoot == num;
    }
}
