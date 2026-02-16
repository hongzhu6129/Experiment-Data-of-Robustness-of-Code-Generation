public class SubstringExample {

    public static void main(String[] args) {
        String str = "programming";
        int start = 2;
        int end = 7;

        if (start >= 0 && end <= str.length() && start <= end) {
            String sub = str.substring(start, end);
            System.out.println("Original String: " + str);
            System.out.println("Substring: " + sub);
        } else {
            System.out.println("Invalid start or end positions.");
        }

        // Another example with different positions and handling potential errors:
        String str2 = "example";
        int start2 = 1;
        int end2 = 9; // Intentionally beyond the string length

        try {
            String sub2 = str2.substring(start2, end2);
            System.out.println("Original String 2: " + str2);
            System.out.println("Substring 2: " + sub2); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid positions for substring in example 2. " + e.getMessage());
        }

          // Another example with negative start:
        String str3 = "negative";
        int start3 = -2;
        int end3 = 5;

        try {
            String sub3 = str3.substring(start3, end3);
            System.out.println("Original String 3: " + str3);
            System.out.println("Substring 3: " + sub3);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid positions for substring in example 3. " + e.getMessage());
        }


    }
}
