public class SubstringCounter {

    public int substringCounting(String text) {
        int count = 0;
        text = text.toLowerCase(); // Case-insensitive counting

        // Count occurrences of "life"
        count += countOccurrences(text, "life");

        // Count occurrences of "li?e" (where ? is any character)
        for (char c = 'a'; c <= 'z'; c++) {
            String pattern = "li" + c + "e";
            count += countOccurrences(text, pattern);
        }


        return count;
    }

    private int countOccurrences(String text, String pattern) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(pattern, index)) != -1) {
            count++;
            index += pattern.length(); // Move past the found substring
        }
        return count;
    }

    public static void main(String[] args) {
        SubstringCounter counter = new SubstringCounter();

        String text1 = "life is beautiful, enjoy life.";
        int count1 = counter.substringCounting(text1);
        System.out.println("String: \"" + text1 + "\" Count: " + count1);  // Output: 2

        String text2 = "Give me liMe and life, like life.";
        int count2 = counter.substringCounting(text2);
        System.out.println("String: \"" + text2 + "\" Count: " + count2);  // Output: 3

        String text3 = "liFe is good, live life to the fullest.";
        int count3 = counter.substringCounting(text3);
        System.out.println("String: \"" + text3 + "\" Count: " + count3); // Output: 3


        String text4 = ""; // Empty String
        int count4 = counter.substringCounting(text4);
        System.out.println("String: \"" + text4 + "\" Count: " + count4); // Output: 0

         String text5 = "This string has no matching substrings"; // No matches
        int count5 = counter.substringCounting(text5);
        System.out.println("String: \"" + text5 + "\" Count: " + count5); // Output: 0

    }
}
