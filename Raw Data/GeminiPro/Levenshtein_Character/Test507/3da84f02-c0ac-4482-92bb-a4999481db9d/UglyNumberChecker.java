public class UglyNumberChecker {

    public static void main(String[] args) {
        int num = 235; // Example number, you can change this to test other inputs

        boolean isUgly = isUgly(num);

        if (isUgly) {
            System.out.println(num + ": It is an ugly number.");
        } else {
            System.out.println(num + ": It is not an ugly number.");
        }

        // Test with another number
        num = 12;
        isUgly = isUgly(num);

        if (isUgly) {
            System.out.println(num + ": It is an ugly number.");
        } else {
            System.out.println(num + ": It is not an ugly number.");
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
