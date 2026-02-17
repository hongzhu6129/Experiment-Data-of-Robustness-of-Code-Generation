public class PrintFacing {

    public static void printFacing(int size) {
        if (size <= 0) {
            System.out.println("Size must be a positive integer.");
            return;
        }

        for (int i = 0; i < size; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int j = 0; j < 2 * (size - i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Size 1:");
        printFacing(1);

        System.out.println("\nSize 3:");
        printFacing(3);
        
        System.out.println("\nSize 5:");
        printFacing(5);

        System.out.println("\nSize 0 (corner case):"); // Corner case: zero size
        printFacing(0);

        System.out.println("\nSize -2 (corner case):"); // Corner case: negative size
        printFacing(-2);

        System.out.println("\nSize 10 (larger size):"); // Larger size test
        printFacing(10);
    }
}

