public class OctalToNumeral {

    public static void main(String[] args) {

        // Test cases (including corner cases)
        String[] octalNumbers = {
                "123", // Normal octal
                "0",   // Zero
                "777", // Largest 3-digit octal
                "10",  // Octal representation of 8
                "7", // single digit
                "12345670", // large octal number
                "12345677",
                "-123" //invalid input (negative), handle this!
        };


        for (String octal : octalNumbers) {
            try {
                int numeral = 0;
                int power = 0;
                boolean negative = false;

                if(octal.startsWith("-")) {
                    negative = true;
                    octal = octal.substring(1); //remove the - sign
                }

                for (int i = octal.length() - 1; i >= 0; i--) {
                    char digitChar = octal.charAt(i);

                    if (digitChar < '0' || digitChar > '7') {
                        throw new IllegalArgumentException("Invalid octal digit: " + digitChar); //Handle non-octal input
                    }

                    int digit = digitChar - '0';
                    numeral += digit * Math.pow(8, power);
                    power++;
                }

                if (negative) {
                    numeral = -numeral;
                }


                System.out.println("Octal: " + (negative ? "-" : "") +octal + " -> Numeral: " + numeral);


            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + " for input " + octal);
            }
        }
    }
}

