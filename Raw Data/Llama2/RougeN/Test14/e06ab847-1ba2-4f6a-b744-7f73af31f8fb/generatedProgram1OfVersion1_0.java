public class PrintOneFacing {

    public static void printOneFacing(int size) {
        if (size < 3) {
            System.out.println("Size must be at least 3.");
            return;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || i == size / 2) { // Left edge and middle row
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces for alignment
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test cases
        printOneFacing(3);   // Minimum size
        printOneFacing(5);   // Odd size
        printOneFacing(6);   // Even size
        printOneFacing(10);  // Larger size
        printOneFacing(2);   // Corner case: size too small
        printOneFacing(1);   // Corner case: size too small
        printOneFacing(0);   // Corner case: zero size
        printOneFacing(-5); // Corner case: negative size

    }
}
