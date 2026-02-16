public class UglyNumberChecker {

    public static void main(String[] args) {
        int num = 235; // Example input, you can change this to test different numbers.
        boolean isUgly = isUgly(num);

        if (isUgly) {
            System.out.println("It is an ugly number.");
        } else {
            System.out.println("It is not an ugly number.");
        }

        // Test with the first 10 ugly numbers plus the example 235.
        int[] testCases = {1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 235, 0, -1};
        for (int testCase : testCases) {
            System.out.println(testCase + ": " + (isUgly(testCase) ? "ugly" : "not ugly"));

        }

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
}
