public class SumDigits {

    public static void main(String[] args) {
        int number = 12345; // Example input

        System.out.println("Original Number: " + number);
        System.out.println("Single Digit Sum: " + addDigits(number));

        number = 99999; // Another example
        System.out.println("\nOriginal Number: " + number);
        System.out.println("Single Digit Sum: " + addDigits(number));

        number = 0; // Example with 0
        System.out.println("\nOriginal Number: " + number);
        System.out.println("Single Digit Sum: " + addDigits(number));



    }


    public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
