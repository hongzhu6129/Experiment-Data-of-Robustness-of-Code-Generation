import java.util.Scanner;

public class OctalToHex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalString = scanner.nextLine();

        try {
            // Corner case 1: Empty string
            if (octalString.isEmpty()) {
                System.out.println("Hexadecimal equivalent: 0");
                return;
            }

            // Corner case 2 & Input validation: Check for invalid octal digits
            for (char c : octalString.toCharArray()) {
                if (c < '0' || c > '7') {
                    System.out.println("Invalid octal number.");
                    return;
                }
            }


            // Convert octal to decimal 
            int decimal = 0;
            int power = 0;
            for (int i = octalString.length() - 1; i >= 0; i--) {
                int digit = octalString.charAt(i) - '0';
                decimal += digit * Math.pow(8, power);
                power++;
            }

            // Convert decimal to hexadecimal
            String hexadecimal = "";
            while (decimal > 0) {
                int remainder = decimal % 16;
                char hexDigit = (remainder < 10) ? (char) (remainder + '0') : (char) (remainder - 10 + 'A');
                hexadecimal = hexDigit + hexadecimal;
                decimal /= 16;
            }
            
            //Corner Case 3: Octal 0 should be Hex 0
             if (hexadecimal.isEmpty()) {
                 hexadecimal = "0";
             }


            System.out.println("Hexadecimal equivalent: " + hexadecimal);


        } catch (NumberFormatException e) {
            // Corner Case 4: Extremely large octal numbers causing overflow.
            System.out.println("Invalid octal number or overflow occurred.");  
        }

    }
}

