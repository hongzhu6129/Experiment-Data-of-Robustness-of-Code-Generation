public class LucasNumbers {

    public static void main(String[] args) {
        int n = 10; // Display the first 10 Lucas numbers
        int a = 2; // First Lucas number
        int b = 1; // Second Lucas number

        System.out.print("First " + n + " Lucas numbers: ");

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
    }
}

