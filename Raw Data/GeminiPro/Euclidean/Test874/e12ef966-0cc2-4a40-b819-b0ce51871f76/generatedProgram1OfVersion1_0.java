public class CapitalizeFirstLetter {

    public static void main(String[] args) {
        String sentence = "the quick brown fox jumps over the lazy dog. the quick brown fox jumps over the lazy dog.";
        String capitalizedSentence = "";

        // Split the sentence into words using spaces and periods as delimiters.
        String[] words = sentence.split("[\\s.]+"); 

        for (String word : words) {
            if (!word.isEmpty()) { // Handle potential empty strings from multiple delimiters
                capitalizedSentence += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }
        }

        // Remove the trailing space and add the final period if the original sentence ended with one.
        capitalizedSentence = capitalizedSentence.trim();
        if (sentence.endsWith(".")) {
            capitalizedSentence += ".";
        }


        System.out.println(capitalizedSentence);
    }
}
