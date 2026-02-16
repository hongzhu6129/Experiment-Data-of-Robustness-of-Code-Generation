public class Main {
    public static void main(String[] args) {
        System.out.println("a\ta^2\ta^3\ta^4"); // Print header
        System.out.println("1\t1\t1\t1");     // Print row for a = 1

        for (int a = 2; a <= 4; a++) {
            System.out.print(a + "\t");        // Print 'a' value
            System.out.print(a * a + "\t");    // Print 'a^2' value
            System.out.print(a * a * a + "\t");  // Print 'a^3' value
            System.out.println(a * a * a * a);  // Print 'a^4' value and newline
        }
    }
}
