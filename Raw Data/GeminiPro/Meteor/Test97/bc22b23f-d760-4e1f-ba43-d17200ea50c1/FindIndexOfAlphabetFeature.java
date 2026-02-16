public class FindIndexOfAlphabetFeature {

    public static void main(String[] args) {
        String word = "java";
        char feature = 'd';

        int index = findIndexOfAlphabetFeature(word, feature);
        if (index != -1) {
            System.out.println("The index of the feature '" + feature + "' in the word '" + word + "' is: " + index);
        } else {
            System.out.println("The feature '" + feature + "' is not found in the word '" + word + "'");
        }
    }

    public static int findIndexOfAlphabetFeature(String word, char feature) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == feature) {
                return i;
            }
        }
        return -1;
    }
}
