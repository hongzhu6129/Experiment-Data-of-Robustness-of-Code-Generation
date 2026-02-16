public class SumOfDigits {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int sum = 0;
        int originalNum = num; // Store the original number for later printing

        if (num < 0) { // Handle negative numbers
            num = -num;
        }
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("The sum of digits of " + originalNum + " is: " + sum);
        printDigitsInEnglish(sum);
    }

    public static void printDigitsInEnglish(int num) {
         String[] englishNumbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        if (num < 0) {
            System.out.print("negative ");
            num = -num; // Make num positive for processing.
        }


        String numStr = String.valueOf(num);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0'; // Convert char to int
            print_number(digit);
            if (i < numStr.length() - 1) {
                System.out.print(" "); // Add space between words
            }
        }
        System.out.println(); // New line after printing all digits.
    }


    public static void print_number(int digit) {
        String[] englishNumbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if(digit >=0 && digit <=9) {
            System.out.print(englishNumbers[digit]);
        }

    }
}
