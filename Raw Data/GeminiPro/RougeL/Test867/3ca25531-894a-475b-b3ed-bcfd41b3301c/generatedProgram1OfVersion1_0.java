public class PrintTable {

    public static void main(String[] args) {
        System.out.println("a\ta^2\ta^3\ta^4"); // Print header
        System.out.println("1\t1\t1\t1");     // Print row for a = 1
        System.out.println("2\t4\t8\t16");    // Print row for a = 2
        System.out.println("3\t9\t27\t81");   // Print row for a = 3
        System.out.println("4\t16\t64\t256");  // Print row for a = 4

        // Alternatively, using a loop:
        /*
        System.out.println("a\ta^2\ta^3\ta^4");

        for (int a = 1; a <= 4; a++) {
            System.out.printf("%d\t%d\t%d\t%d\n", a, a * a, a * a * a, a * a * a * a);
        }
         */
    }
}
