public class LucasNumbers {

    public static void main(String[] args) {
        int n = 10; // Display the first 10 Lucas numbers

        int a = 2;
        int b = 1;

        System.out.print("The first " + n + " Lucas numbers are: ");

        if (n >= 1) {
            System.out.print(a + " "); 
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }

        for (int i = 3; i <= n; i++) {
            int nextLucas = a + b;
            System.out.print(nextLucas + " ");
            a = b;
            b = nextLucas;
        }
        System.out.println(); // Add a newline at the end for cleaner output
    }
}
