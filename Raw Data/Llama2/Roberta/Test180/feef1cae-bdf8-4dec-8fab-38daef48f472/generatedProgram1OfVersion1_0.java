public class FactorsOfThree {

    public static void main(String[] args) {
        test(12); // Example usage: Factors of 3 in 12 are 3 and 12
        test(15); // Example usage: Factors of 3 in 15 are 3 and 15
        test(7);  // Example usage: No factors of 3 found in 7
        test(27); // Example usage: Factors of 3 in 27 are 3, 9, and 27
    }

    public static void test(int n) {
        boolean found = false;
        System.out.print("Factors of 3 in " + n + " are ");

        for (int i = 3; i <= n; i +=3) {  // Optimized loop: increment by 3 to only check multiples of 3
            if (n % i == 0) { 
                System.out.print(i + " ");
                found = true;
            }

           //Optimization.  If n is not divisible by 3 it won't be divisible by other multiples of 3, so we can stop. 
            if (!found && n % 3 !=0)
            {
                break;
            }
        }
        if (!found) {
            System.out.print("No factors of 3 found in " + n);
        }
        System.out.println(); // Newline for better output formatting
    }
}
