import java.util.Scanner;

public class NumberConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get the number from the user
        System.out.print("Enter a number between 0 and 999: ");
        int number = input.nextInt();
        
        // Initialize the string to store the converted number
        String convertedNumber = "";
        
        // Check if the number is in the valid range
        if (number < 0 || number > 999) {
            System.out.println("Invalid number. Please enter a number between 0 and 999.");
        } else {
            // Convert the number to words
            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int ones = number % 10;
            
            if (hundreds > 0) {
                convertedNumber += getHundreds(hundreds) + " ";
            }
            if (tens > 0) {
                convertedNumber += getTens(tens) + " ";
            }
            if (ones > 0) {
                convertedNumber += getOnes(ones);
            }
        }
        
        // Print the converted number
        System.out.println("The number in words is: " + convertedNumber.trim());
    }
    
    private static String getHundreds(int hundreds) {
        String[] hundredsArray = {"", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
        return hundredsArray[hundreds];
    }
    
    private static String getTens(int tens) {
        String[] tensArray = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        return tensArray[tens];
    }
    
    private static String getOnes(int ones) {
        String[] onesArray = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        return onesArray[ones];
    }
}
