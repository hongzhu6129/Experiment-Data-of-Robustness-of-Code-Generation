public class ExtractFirstDigit {

    public static void main(String[] args) {
        System.out.println(test(12345)); // Output: 1
        System.out.println(test(-12345)); // Output: -1
        System.out.println(test(0)); // Output: 0
        System.out.println(test(7)); // Output: 7
        System.out.println(test(-8)); // Output: -8
        System.out.println(test(100)); // Output: 1

    }

    public static int test(int n) {
        if (n == 0) {
            return 0;
        }

        int absN = Math.abs(n);
        while (absN >= 10) {
            absN /= 10;
        }

        return (n < 0) ? -absN : absN; 
    }
}
