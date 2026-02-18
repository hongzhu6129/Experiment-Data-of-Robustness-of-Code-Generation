public class RemoveWord {

    public static void main(String[] args) {
        String text = "This is a sample text with a repeated word.";
        String wordToRemove = "a";

        String result = test(text, wordToRemove);
        System.out.println(result); // Output: This is  sample text with  repeated word.

        text = "Another example sentence.";
        wordToRemove = "sentence.";
        result = test(text, wordToRemove);
        System.out.println(result); // Output: Another example 

         text = "No matching words here.";
        wordToRemove = "missing";
        result = test(text, wordToRemove);
        System.out.println(result); // Output: No matching words here.


    }

    public static String test(String text, String wordToRemove) {
        // Using replaceAll with word boundaries (\b) to avoid partial matches.
        return text.replaceAll("\\b" + wordToRemove + "\\b", ""); 
    }
}
