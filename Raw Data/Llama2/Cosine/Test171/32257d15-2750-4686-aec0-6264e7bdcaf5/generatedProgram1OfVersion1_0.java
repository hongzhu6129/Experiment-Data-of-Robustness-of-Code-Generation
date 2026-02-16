class Solution {

    public static void main(String[] args) {
        test(12); // Example usage: Factors of 3 in 12
        test(27); // Example usage: Factors of 3 in 27
        test(10); // Example usage: Factors of 3 in 10 
    }

    public static void test(int n) {
        System.out.print("Factors of 3 in " + n + ": ");
        int factor = 3;
        int temp = n;

        while (temp > 0) {
            if (temp % factor == 0) {
                 System.out.print(factor + " ");
                 temp /= factor; //Divide by the factor to find higher powers
            } else {
                break; // No more factors of 3
            }
        }

        if (n % 3 != 0) { // Original number was not divisible by 3 at all
            System.out.print("None");
        }


        System.out.println(); // Newline for clarity
    }
}
