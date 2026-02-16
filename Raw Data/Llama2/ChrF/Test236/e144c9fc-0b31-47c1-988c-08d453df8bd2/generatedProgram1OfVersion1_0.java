public class UglyNumberChecker {

    public static void main(String[] args) {
        int num = 235; // Example input, you can modify this

        if (isUgly(num)) {
            System.out.println(num + ": it is an ugly number.");
        } else {
            System.out.println(num + ": it is not an ugly number.");
        }



        // Test cases
        testUglyNumber(1, true);
        testUglyNumber(2, true);
        testUglyNumber(3, true);
        testUglyNumber(4, true);
        testUglyNumber(5, true);
        testUglyNumber(6, true);
        testUglyNumber(8, true);
        testUglyNumber(9, true);
        testUglyNumber(10, true);
        testUglyNumber(12, true);
        testUglyNumber(14, false);  // Example of a non-ugly number
        testUglyNumber(235, false);


    }

    public static boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }

        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }

        return num == 1;
    }

    // Helper function to test cases
    public static void testUglyNumber(int num, boolean expected) {
        if (isUgly(num) == expected) {
            System.out.println("Test for " + num + " passed.");
        } else {
            System.err.println("Test for " + num + " failed. Expected: " + expected + ", Actual: " + isUgly(num));
        }
    }


}
