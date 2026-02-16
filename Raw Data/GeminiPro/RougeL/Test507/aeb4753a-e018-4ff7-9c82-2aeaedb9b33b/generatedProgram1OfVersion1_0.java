public class UglyNumberChecker {

    public static void main(String[] args) {
        int num = 235; // Example number, you can change this for testing

        System.out.println(num + ": " + (isUgly(num) ? "It is an ugly number." : "It is not an ugly number."));

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
