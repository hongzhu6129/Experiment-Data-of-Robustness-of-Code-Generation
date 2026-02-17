import java.util.Scanner;

public class SumDigits {

    public static int function(int n) {
        int sum = 0;
        n = Math.abs(n); // Handle negative numbers

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int sumOfDigits = function(num);
        System.out.println("Sum of digits: " + sumOfDigits);
        scanner.close();

       //Test cases (you can add these to your main method or create a separate test class)
        testCases(); 
    }


    public static void testCases(){
        System.out.println("Running Test Cases...");
        assert function(123) == 6 : "Test 1 failed";
        assert function(0) == 0 : "Test 2 failed";
        assert function(-123) == 6 : "Test 3 failed"; // Negative number
        assert function(9999) == 36 : "Test 4 failed"; // Large number
        assert function(1) == 1 : "Test 5 failed";    // Single digit
        assert function(10) == 1 : "Test 6 failed";   // Number with zero
        assert function(Integer.MAX_VALUE) == 46 : "Test 7 failed"; //Max Value
        assert function(Integer.MIN_VALUE + 1) == 47 : "Test 8 failed";  // Because of two's complement, MIN_VALUE has to be handled this way.
        System.out.println("All test cases passed!");
    }
}
