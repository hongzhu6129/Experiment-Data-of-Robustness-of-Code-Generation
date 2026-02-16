public class StringPermutationWithRepetition {

    public static void main(String[] args) {
        String inputString = "abc";
        permutationWithRepeation(inputString);
    }

    private static void permutationWithRepeation(String inputString) {
        showPermutation(inputString, "");
    }

    private static void showPermutation(String inputString, String currentPermutation) {
        if (currentPermutation.length() == inputString.length()) {
            System.out.println(currentPermutation);
            return;
        }

        for (int i = 0; i < inputString.length(); i++) {
            showPermutation(inputString, currentPermutation + inputString.charAt(i));
        }
    }
}
