public class CubeChecker {

    public static void main(String[] args) {
        // Input data (for testing within main method)
        int number = 8; 

        // Check if the number is a cube
        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        // Example with user input (requires exception handling):
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");

        try {
            int inputNumber = scanner.nextInt();
            if (isCube(inputNumber)) {
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

    private static boolean isCube(int number) {
        // Handle negative numbers: The cube root of a negative number is negative.
        int absNumber = Math.abs(number);

        // Binary search is an efficient way to find the cube root for integers
        int low = 0;
        int high = absNumber;  // or a better upper bound if you have a limit

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid potential integer overflow
            int cube = mid * mid * mid;

            if (cube == absNumber) {
                 return (number < 0) ? (mid%2 != 0) : true; //For negative number, cube root should be negative, which means it should be odd.
            } else if (cube < absNumber) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
