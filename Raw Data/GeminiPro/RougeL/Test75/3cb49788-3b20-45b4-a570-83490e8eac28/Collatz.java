public class Collatz {

    public static void main(String[] args) {
        int n = 10; // Example starting value.  You can change this.

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.print(n); 

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
            System.out.print(" -> " + n);
        }
    }
}
