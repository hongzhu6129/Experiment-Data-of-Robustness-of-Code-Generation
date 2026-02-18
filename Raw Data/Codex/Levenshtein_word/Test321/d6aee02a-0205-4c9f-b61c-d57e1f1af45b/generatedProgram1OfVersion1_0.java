public class EuclidGCD {

    public static int euclid(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        // Test cases demonstrating Euclid's algorithm and proof by example
        int num1 = 12;
        int num2 = 18;
        int gcd = euclid(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " (using Euclid's algorithm): " + gcd);

        num1 = 48;
        num2 = 18;
        gcd = euclid(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " (using Euclid's algorithm): " + gcd);

        num1 = 17; // Example with coprime numbers
        num2 = 25; 
        gcd = euclid(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " (using Euclid's algorithm): " + gcd);


        // A more formal demonstration would involve proving 
        // mathematically that the algorithm always maintains the 
        // invariant that gcd(a, b) = gcd(b, a % b) until b becomes 0, 
        // at which point gcd(a, 0) = a. This can be proven using the 
        // division algorithm and properties of divisibility.  We keep 
        // the scope limited to the provided method signatures in this code example.


    }
}
