public class ReverseInteger {

    public static void main(String[] args) {
        int number = 12345; // Example number
        int reversedNumber = 0;

        System.out.println("Original Number: " + number);


        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversedNumber);

        // Handling integer overflow (though limited within main method)
        number = Integer.MAX_VALUE; // Example overflow case
        reversedNumber = 0;

        System.out.println("\nOriginal Number (Overflow Case): " + number);

        try {
            while (number != 0) {
                int digit = number % 10;

                if (reversedNumber > Integer.MAX_VALUE / 10 || (reversedNumber == Integer.MAX_VALUE / 10 && digit > 7)) {
                     throw new ArithmeticException("Integer overflow occurred during reversal.");
                }

                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            System.out.println("Reversed Number (Overflow Case): " + reversedNumber);


        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
