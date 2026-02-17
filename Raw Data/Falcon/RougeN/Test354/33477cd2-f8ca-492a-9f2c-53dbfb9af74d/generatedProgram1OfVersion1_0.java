public class ReplaceDiphthongs {

    public static void main(String[] args) {
        String inputString = "beautiful aerial view";
        char replacementChar = '*';

        String result = validate(inputString, replacementChar);
        System.out.println("Original string: " + inputString);
        System.out.println("Modified string: " + result);


        inputString = "sequoia"; // Example with "oi"
        replacementChar = '-';
        result = validate(inputString, replacementChar);
        System.out.println("Original string: " + inputString);
        System.out.println("Modified string: " + result);

    }

    public static String validate(String inputString, char replacementChar) {
        if (inputString == null || inputString.isEmpty()) {
            return inputString; // Handle null or empty input
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            // Check for common diphthongs (you can add more)
            if (i < inputString.length() - 1) {
                char nextChar = inputString.charAt(i + 1);
                String diphthong = String.valueOf(currentChar) + nextChar;

                if (diphthong.equalsIgnoreCase("ae") ||
                    diphthong.equalsIgnoreCase("ai") ||
                    diphthong.equalsIgnoreCase("au") ||
                    diphthong.equalsIgnoreCase("ea") ||
                    diphthong.equalsIgnoreCase("ee") ||
                    diphthong.equalsIgnoreCase("ei") ||
                    diphthong.equalsIgnoreCase("eu") ||
                    diphthong.equalsIgnoreCase("ie") ||
                    diphthong.equalsIgnoreCase("oa") ||
                    diphthong.equalsIgnoreCase("oe") ||
                    diphthong.equalsIgnoreCase("oi") ||  // Added "oi"
                    diphthong.equalsIgnoreCase("oo") ||
                    diphthong.equalsIgnoreCase("ou") ||
                    diphthong.equalsIgnoreCase("ue") ||
                    diphthong.equalsIgnoreCase("ui")) {

                    sb.append(replacementChar);
                    i++; // Skip the next character (part of the diphthong)
                    continue; // Move to the next iteration
                }
            }

            sb.append(currentChar);
        }

        return sb.toString();
    }
}
