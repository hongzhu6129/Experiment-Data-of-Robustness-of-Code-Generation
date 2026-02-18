public class CubeChecker {

    public static void main(String[] args) {
        // Input handling (assuming input is provided as a command-line argument)
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            checkCube(number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }

    private static void checkCube(int number) {
        int cubeRoot = Math.round(Math.cbrt(number)); // Calculate the cube root and round to the nearest integer

        if (cubeRoot * cubeRoot * cubeRoot == number) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }
}



