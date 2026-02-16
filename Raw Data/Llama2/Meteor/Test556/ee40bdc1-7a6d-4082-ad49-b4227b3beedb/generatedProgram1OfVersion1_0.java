public class CapitalizeFirstLetter {

    public static void main(String[] args) {
        String sentence = "the quick brown fox jumps over the lazy dog.";
        String capitalizedSentence = capitalizeWords(sentence);
        System.out.println(capitalizedSentence);
    }

    private static String capitalizeWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                String firstLetter = word.substring(0, 1).toUpperCase();
                String restOfWord = word.substring(1);
                capitalizedSentence.append(firstLetter).append(restOfWord).append(" ");
            } else {
                capitalizedSentence.append(" "); // Handle multiple spaces
            }
        }

        return capitalizedSentence.toString().trim(); // Remove trailing space
    }
}
