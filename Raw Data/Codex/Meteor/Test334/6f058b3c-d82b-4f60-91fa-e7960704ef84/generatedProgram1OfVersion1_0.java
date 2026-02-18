public class RemoveNonAlphanumericFromDouble {

    public static void main(String[] args) {
        double num1 = 123.456;
        double num2 = 123.456abc;
        double num3 = -123.456;
        double num4 = 123.456e7; // Scientific notation

        System.out.println(validate(String.valueOf(num1))); // Output: 123456
        System.out.println(validate(String.valueOf(num2))); // Output: 123456
        System.out.println(validate(String.valueOf(num3))); // Output: -123456
        System.out.println(validate(String.valueOf(num4))); // Output: 1234567


    }

    public static String validate(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c) || (c=='-' )) { // Check if the character is a digit or negative sign
                result.append(c);
            } else if (c == '.') { // Remove the decimal point but keep the rest of the number
                continue;  // Skip the decimal point
            }
            else if (c == 'e' || c == 'E'){ //Handle scientific notation
                continue;
            }


        }


        return result.toString();
    }
}
