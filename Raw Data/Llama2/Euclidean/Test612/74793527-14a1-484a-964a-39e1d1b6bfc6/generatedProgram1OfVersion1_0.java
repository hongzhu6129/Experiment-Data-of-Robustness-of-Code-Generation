public class LucasNumbers {

    public static void main(String[] args) {
        int n = 10; // Display the first 10 Lucas numbers

        int a = 2;
        int b = 1;

        System.out.print("First 10 Lucas numbers: ");

        if (n > 0) {
            System.out.print(a + " "); // Print the first Lucas number
            n--; 
        }

        if (n > 0) {
            System.out.print(b + " "); // Print the second Lucas number
            n--;
        }


        for (int i = 0; i < n; i++) {
            int nextLucas = a + b;
            System.out.print(nextLucas + " ");
            a = b;
            b = nextLucas;
        }
         System.out.println(); // Add a newline for cleaner output
    }
}
