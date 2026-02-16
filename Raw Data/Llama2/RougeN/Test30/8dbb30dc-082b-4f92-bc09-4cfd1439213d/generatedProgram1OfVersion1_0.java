public class RemoveCharacters {

    public static void main(String[] args) {
        String inputString = "abracadabra";
        String charsToRemove = "b";
        String sequenceToRemove = "ac";

        removeSetofCharacters(inputString, charsToRemove, sequenceToRemove);
    }

    public static void removeSetofCharacters(String inputString, String charsToRemove, String sequenceToRemove) {
        if (inputString == null || inputString.isEmpty()) {
            System.out.println(""); // Handle empty or null input
            return;
        }


        StringBuilder result = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (charsToRemove.indexOf(c) == -1) { // Check if the character is in charsToRemove
                result.append(c);
            }
        }


        String intermediateResult = result.toString();
        String finalResult = intermediateResult.replace(sequenceToRemove, ""); // Remove the sequence

        System.out.println(finalResult);


    }
}
