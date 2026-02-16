public class RemoveCharacters {

    public static void main(String[] args) {
        String inputString = "abracadabra";
        String charsToRemove = "b";
        String stringToRemove = "ac";

        removeSetofCharacters(inputString, charsToRemove, stringToRemove);

        inputString = "acbacbac";
        charsToRemove = "b";
        stringToRemove = "ac";
        removeSetofCharacters(inputString, charsToRemove, stringToRemove);


    }

    public static void removeSetofCharacters(String inputString, String charsToRemove, String stringToRemove) {
        // Remove individual characters
        for (char c : charsToRemove.toCharArray()) {
            inputString = inputString.replace(String.valueOf(c), "");
        }

        // Remove the string
        inputString = inputString.replace(stringToRemove, "");


        System.out.println("Result: " + inputString);

    }
}
