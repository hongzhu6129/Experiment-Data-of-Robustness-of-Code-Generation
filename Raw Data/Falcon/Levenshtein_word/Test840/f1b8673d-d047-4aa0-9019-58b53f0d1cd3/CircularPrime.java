import java.util.Scanner;

class CircularPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();

        if (isCircularPrime(num)) {
            System.out.println("It is a Circular Prime number.");
        } else {
            System.out.println("It is not a Circular Prime number.");
        }
        scanner.close();
    }


    public static boolean isCircularPrime(int n) {
        if (!isPrime(n)) {
            return false;
        }

        int num = n;
        int numDigits = String.valueOf(n).length();

        for (int i = 0; i < numDigits -1; i++) {  // Rotate numDigits-1 times, original is already checked
            num = circulate_func(num, numDigits);
            if (!isPrime(num)) {
                return false;
            }
        }
        return true;
    }



    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static int circulate_func(int n, int numDigits) {
        int powerOf10 = (int) Math.pow(10, numDigits - 1);
        int lastDigit = n % 10;
        int remainingDigits = n / 10;
        return lastDigit * powerOf10 + remainingDigits;
    }
}
