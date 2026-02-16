public class StringPermutationsWithRepetition {

    public static void main(String[] args) {
        String str = "abc"; // Example string
        permutationWithRepeation(str);
    }

    private static void permutationWithRepeation(String str) {
        showPermutation(str, "");
    }

    private static void showPermutation(String str, String prefix) {
        if (prefix.length() == str.length()) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            showPermutation(str, prefix + str.charAt(i));
        }
    }
}
