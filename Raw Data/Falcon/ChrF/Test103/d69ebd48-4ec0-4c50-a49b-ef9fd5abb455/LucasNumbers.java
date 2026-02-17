public class LucasNumbers {

    public static void main(String[] args) {
        int n = 10; // Number of Lucas numbers to display

        int l0 = 2;
        int l1 = 1;

        System.out.print("First 10 Lucas numbers: ");

        if (n >= 1) {
            System.out.print(l0 + " ");
        }
        if (n >= 2) {
            System.out.print(l1 + " ");
        }

        for (int i = 2; i < n; i++) {
            int nextLucas = l0 + l1;
            System.out.print(nextLucas + " ");
            l0 = l1;
            l1 = nextLucas;
        }
        System.out.println(); // Add a newline at the end for better formatting
    }
}
