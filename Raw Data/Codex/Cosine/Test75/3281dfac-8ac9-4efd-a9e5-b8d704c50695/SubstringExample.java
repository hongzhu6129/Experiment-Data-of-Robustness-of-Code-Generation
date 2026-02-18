public class SubstringExample {

    public static void main(String[] args) {

        String str = "This is a test string";
        int startIndex = 10;
        int endIndex = 15;

        if (startIndex >= 0 && endIndex <= str.length() && startIndex <= endIndex) {
            String substring = str.substring(startIndex, endIndex);
            System.out.println("Substring: " + substring);
        } else {
            System.out.println("Invalid start or end indices.");
        }


        //Another example demonstrating edge cases:
        String str2 = "Hello";
        int start2 = 0;
        int end2 = 5; // endIndex is exclusive, so this gets the whole string

        if (start2 >= 0 && end2 <= str2.length() && start2 <= end2) {
            String substring2 = str2.substring(start2, end2);
            System.out.println("Substring 2: " + substring2); // Output: Hello
        } else {
            System.out.println("Invalid start or end indices.");
        }

        int start3 = 2;
        int end3 = 2; //empty string

        if (start3 >= 0 && end3 <= str2.length() && start3 <= end3) {
            String substring3 = str2.substring(start3, end3);
            System.out.println("Substring 3: " + substring3); // Output: (empty string)
        } else {
            System.out.println("Invalid start or end indices.");
        }


    }
}
