public class InverseMatrixPrinter {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java InverseMatrixPrinter <n>");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);
            printMatrix(n);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check if we are on the inverse diagonal
                if (i + j == n - 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // Newline after each row
        }
    }
}
