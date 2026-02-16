public class IntegerToLegitimacy {

    public static void main(String[] args) {
        int input = 12345; // Example input
        int legitimacyValue = convert(input);
        System.out.println("Legitimacy value of " + input + " is: " + legitimacyValue);


        input = -5000; // Another example
        legitimacyValue = convert(input);
        System.out.println("Legitimacy value of " + input + " is: " + legitimacyValue);

        input = 0; // Example with 0
        legitimacyValue = convert(input);
        System.out.println("Legitimacy value of " + input + " is: " + legitimacyValue);


    }

    public static int convert(int num) {
        //  Here, "legitimacy" isn't a standard term. I'll provide a few
        // different interpretations and you can choose or adapt as needed:

        // 1. Absolute Value (Interpreting "legitimacy" as magnitude)
        // return Math.abs(num);

        // 2. Signum Function  (Interpreting "legitimacy" as just positive/negative/zero status)
        // return Integer.signum(num);


        // 3. Custom Mapping (Example: Positive numbers -> 1, Negative -> -1, Zero -> 0)
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }

        // 4. Digit Sum (Interpreting "legitimacy" as the sum of digits)
        // int sum = 0;
        // num = Math.abs(num); // Handle negative numbers if needed
        // while (num > 0) {
        //     sum += num % 10;
        //     num /= 10;
        // }
        // return sum;


        // 5.  Return the input unchanged (If "legitimacy" has no special meaning)
        // return num;
    }
}
