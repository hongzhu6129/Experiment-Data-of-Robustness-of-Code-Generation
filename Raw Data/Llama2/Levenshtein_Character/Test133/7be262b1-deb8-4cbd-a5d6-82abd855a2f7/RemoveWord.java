public class RemoveWord {

    public static void main(String[] args) {
        String text = "This is a sample text with a specific word.";
        String wordToRemove = "specific";

        String updatedText = test(text, wordToRemove);
        System.out.println(updatedText); // Output: This is a sample text with a word.


        text = "Another example with the word to remove.";
        wordToRemove = "to";
        updatedText = test(text, wordToRemove);
        System.out.println(updatedText); // Output: Another example with the word remove.

        text = "No word to remove in this text.";
        wordToRemove = "nonexistent";
        updatedText = test(text, wordToRemove);
        System.out.println(updatedText); // Output: No word to remove in this text.


        text = "Word at the beginning to remove.";
        wordToRemove = "Word";
        updatedText = test(text, wordToRemove);
        System.out.println(updatedText); // Output:  at the beginning to remove.



                text = "remove word at the end remove.";
        wordToRemove = "remove";
        updatedText = test(text, wordToRemove);
        System.out.println(updatedText); // Output:  word at the end .



    }

    public static String test(String text, String wordToRemove) {
        // Remove leading and trailing spaces from wordToRemove for accurate matching
        wordToRemove = wordToRemove.trim();


        // Use replaceAll with word boundaries (\b) to avoid partial matches
        // For example, removing "cat" shouldn't affect "scattered"
        return text.replaceAll("\\b" + wordToRemove + "\\b", "").trim();


    }
}
