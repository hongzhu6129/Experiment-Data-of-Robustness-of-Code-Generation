import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        String roman numeral = "MCMXCIV"; // Example Roman numeral
        int result = romanToInt(roman numeral);
        System.out.println("The integer value of " + roman numeral + " is: " + result);


        roman numeral = "IX"; // Another example
        result = romanToInt(roman numeral);
        System.out.println("The integer value of " + roman numeral + " is: " + result);


        roman numeral = "LVIII"; // Yet another example
        result = romanToInt(roman numeral);
        System.out.println("The integer value of " + roman numeral + " is: " + result);
    }

    public static int romanToInt(String s) {
        // Create a map to store Roman numeral values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;


        // Iterate through the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));


            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {  // Otherwise, add it
                result += currentValue;
            }


            // Update the previous value
            prevValue = currentValue;

        }

        return result;

    }
}
