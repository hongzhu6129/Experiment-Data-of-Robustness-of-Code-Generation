public class UglyNumberChecker {

    public static void main(String[] args) {
        int num = 235; // Example number, you can change this

        if (isUgly(num)) {
            System.out.println(num + " is an ugly number.");
        } else {
            System.out.println(num + " is not an ugly number.");
        }



        num = 12;
        if (isUgly(num)) {
            System.out.println(num + " is an ugly number.");
        } else {
            System.out.println(num + " is not an ugly number.");
        }

        num = 1; // Test case for 1
        if (isUgly(num)) {
            System.out.println(num + " is an ugly number.");
        } else {
            System.out.println(num + " is not an ugly number.");
        }

        num = 0; // Test case for 0
        if (isUgly(num)) {
            System.out.println(num + " is an ugly number.");
        } else {
            System.out.println(num + " is not an ugly number.");
        }

          num = -10; // Test case for negative
        if (isUgly(num)) {
            System.out.println(num + " is an ugly number.");
        } else {
            System.out.println(num + " is not an ugly number.");
        }




    }

    static boolean isUgly(int num) {
        if (num <= 0) {  // Handle 0 and negative numbers, they are not ugly
            return false; 
        }
        if (num == 1) { 
            return true;
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
