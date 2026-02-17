public class MatrixPrinter {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java MatrixPrinter <n>");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            if (n <= 0) {
                System.out.println("n must be a positive integer.");
                return;
            }
            printMatrix(n);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: n must be an integer.");
        }
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("X "); // Or print any desired character/value
            }
            System.out.println(); // New line after each row
        }
    }
}
