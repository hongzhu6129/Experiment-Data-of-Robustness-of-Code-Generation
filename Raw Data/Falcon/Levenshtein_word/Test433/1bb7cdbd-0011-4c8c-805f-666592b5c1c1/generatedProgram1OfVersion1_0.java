public class CubeChecker {

    public static void main(String[] args) {
        // Input handling (assuming input is provided as a command-line argument)
        if (args.length != 1) {
            System.out.println("Usage: java CubeChecker <number>");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

            // Efficient Cube Check using Math.cbrt() and casting
            double cubeRoot = Math.cbrt(number);
            if (cubeRoot == (int) cubeRoot) {
                System.out.println("Number is a cube.");
            } else {
                System.out.println("Number is not a cube.");
            }


        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
