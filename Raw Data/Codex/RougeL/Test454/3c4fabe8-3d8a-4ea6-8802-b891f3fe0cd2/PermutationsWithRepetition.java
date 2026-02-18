public class PermutationsWithRepetition {

    public static void main(String[] args) {
        String input = "ab"; // Example input string
        permutationWithRepeation(input);
    }

    private static void permutationWithRepeation(String input) {
        showPermutation(input, "");
    }

    private static void showPermutation(String input, String currentPermutation) {
        if (currentPermutation.length() == input.length()) {
            System.out.println(currentPermutation);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            showPermutation(input, currentPermutation + input.charAt(i));
        }
    }
}
