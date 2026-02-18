public class RemoveCharacters {

    public static void main(String[] args) {
        String inputString = "abracadabra";
        String charsToRemove = "b";
        String setToRemove = "ac";

        removeSetofCharacters(inputString, charsToRemove, setToRemove);
    }

    public static void removeSetofCharacters(String inputString, String charsToRemove, String setToRemove) {
        // Remove individual characters
        String result = inputString;
        for (char c : charsToRemove.toCharArray()) {
            result = result.replace(String.valueOf(c), "");
        }

        // Remove the set of characters
        result = result.replace(setToRemove, "");

        System.out.println("String after removing characters: " + result);

    }
}
