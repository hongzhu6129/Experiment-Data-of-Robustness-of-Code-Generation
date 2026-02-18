public class OctalToDecimal {

    public static void main(String[] args) {

        // Test cases
        String[] octalNumbers = {"123", "777", "0", "10", "42", "12345670",  "invalid", "876", "-123"}; // Includes valid octal, zero, large octal, invalid characters, and negative

        for (String octal : octalNumbers) {
            try {
                long decimal = 0;
                long power = 1;
                boolean isValid = true;

                for (int i = octal.length() - 1; i >= 0; i--) {
                    char digit = octal.charAt(i);

                    if (digit >= '0' && digit <= '7') {
                        decimal += (digit - '0') * power;
                        power *= 8;

                    } else if(i==0 && digit == '-'){ //Handle negative numbers
                       decimal *= -1;
                    }
                    else {
                        isValid = false;
                        break; 
                    }
                }


                if (isValid) {
                    System.out.println("Octal " + octal + " = Decimal " + decimal);
                } else {
                    System.out.println("Invalid octal number: " + octal);
                }
            } catch (Exception e) {
                System.out.println("Error converting " + octal + ": " + e.getMessage());
            }

        }
    }
}




