public class LastSevenChars {

    public static void main(String[] args) {
        String originalString = "ThisIsALongerStringThanSeven"; // Example string

        if (originalString.length() <= 3) {
            System.out.println("String length must be greater than 3.");
            return; // Exit if the string is too short
        }


        String lastSeven;

        if (originalString.length() < 7) {
             lastSeven = originalString; // If the string is shorter than 7, take the whole string
        } else {
            lastSeven = originalString.substring(originalString.length() - 7);
        }


        String firstThree = originalString.substring(0, 3);

        String modifiedString = firstThree + lastSeven + firstThree;

        System.out.println(modifiedString);



        // Test cases with different string lengths
        testAndPrint("Short", "ShoShoSho"); // Length < 7
        testAndPrint("AnotherShortOne", "AnoOneAno"); // Length > 7 but < 10
        testAndPrint("ThisIsALongerStringThanSeven", "ThiThanSevenThi"); // Length > 10
         testAndPrint("1234567", "1234567123"); // Length = 7
        testAndPrint("123", "123123"); // Length = 3 (Edge case, now handles correctly based on the prompt)
        testAndPrint("12", "String length must be greater than 3."); // Length < 3 

    }

     static void testAndPrint(String input, String expected) {
         if (input.length() <= 3) {
             System.out.println("Input: \"" + input + "\"  Expected Output: \"" + expected + "\"");
              return;
         }
         String lastSeven;
           if (input.length() < 7) {
             lastSeven = input; 
        } else {
            lastSeven = input.substring(input.length() - 7);
        }
        String firstThree = input.substring(0, 3);
         String actual =  firstThree + lastSeven + firstThree;
         System.out.println("Input: \"" + input + "\"  Expected Output: \"" + expected + "\" Actual Output: \"" + actual+ "\"");

     }
}
