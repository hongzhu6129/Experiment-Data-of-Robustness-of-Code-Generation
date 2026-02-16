public class RemoveCharacters {

    public static void main(String[] args) {
        String inputString = "abracadabra";
        String charsToRemove1 = "b";
        String charsToRemove2 = "ac";

        removeSetofCharacters(inputString, charsToRemove1, charsToRemove2);

        inputString = "cabac";
        removeSetofCharacters(inputString, charsToRemove1, charsToRemove2); // Example 2


    }

    public static void removeSetofCharacters(String inputString, String charsToRemove1, String charsToRemove2) {
        // Remove characters in charsToRemove1
        String result = inputString.replaceAll("[" + charsToRemove1 + "]", "");

        // Remove characters in charsToRemove2 from the intermediate result
        result = result.replaceAll("[" + charsToRemove2 + "]", "");

        System.out.println("Modified string: " + result);
    }
}
