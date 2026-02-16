public class StringStartsWith {

    public static void main(String[] args) {
        String string1 = "Hello how are you?";
        String word = "Hello";

        // Method 1: Using startsWith()
        boolean startsWithWord = string1.startsWith(word);
        System.out.println("Using startsWith(): String starts with '" + word + "': " + startsWithWord);


        // Method 2: Using substring() and equals() (for demonstration)
        if (string1.length() >= word.length()) {
            String substring = string1.substring(0, word.length());
            boolean startsWithWord2 = substring.equals(word);
            System.out.println("Using substring() and equals(): String starts with '" + word + "': " + startsWithWord2);
        } else {
            System.out.println("Using substring() and equals(): String starts with '" + word + "': false"); // String is shorter than the word
        }


        // Example with different cases (case-sensitive)
        String string2 = "hello how are you?"; 
        boolean startsWithWordCaseSensitive = string2.startsWith(word);
        System.out.println("Case-sensitive check: String starts with '" + word + "': " + startsWithWordCaseSensitive);


        // Case-insensitive check (one way)
        boolean startsWithWordCaseInsensitive = string2.toLowerCase().startsWith(word.toLowerCase());
        System.out.println("Case-insensitive check: String starts with '" + word + "': " + startsWithWordCaseInsensitive);

    }
}
