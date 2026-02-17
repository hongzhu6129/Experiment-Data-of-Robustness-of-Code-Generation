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
            System.out.println("Invalid input. Please enter an integer.");
        }
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("1 "); // Or any other desired element.  For simplicity, using "1"
            }
            System.out.println();  // Newline after each row
        }
    }
}
