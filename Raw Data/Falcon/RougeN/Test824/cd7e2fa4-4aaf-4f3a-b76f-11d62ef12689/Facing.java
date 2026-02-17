public class Facing {

    public static void printFacing(int size) {
        if (size <= 0) {
            System.out.println("Size must be a positive integer.");
            return;
        }

        for (int i = 0; i < size; i++) {
            // First and last row: print all "*"
            if (i == 0 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("*");
                }
            } else {
                // Other rows: "*" at the beginning and end, spaces in between
                System.out.print("*");
                for (int j = 1; j < size - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println(); // Newline after each row
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Size 1:");
        printFacing(1); // Corner case: single star

        System.out.println("\nSize 3:");
        printFacing(3);

        System.out.println("\nSize 5:");
        printFacing(5);

        System.out.println("\nSize 0:"); // Corner case: invalid input
        printFacing(0);

        System.out.println("\nSize -2:"); // Corner case: invalid input
        printFacing(-2);

        System.out.println("\nSize 10:");
        printFacing(10);

        System.out.println("\nSize 2:"); // Corner case: filled square
        printFacing(2);
    }
}
