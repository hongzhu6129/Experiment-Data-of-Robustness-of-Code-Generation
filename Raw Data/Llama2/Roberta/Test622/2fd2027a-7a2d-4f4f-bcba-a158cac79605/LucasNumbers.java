public class LucasNumbers {

    public static void main(String[] args) {
        int n = 10; // Display the first 10 Lucas numbers

        System.out.println("The first " + n + " Lucas numbers are:");

        int a = 2;
        int b = 1;

        // Print the first two Lucas numbers (L0 and L1)
        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }

        // Calculate and print the remaining Lucas numbers
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println(); // Add a newline for better formatting
    }
}
