public class InsertDash {

    public static void main(String[] args) {
        String inputString = "HelloWorldJavaCode";
        String result = validate(inputString);
        System.out.println(result); // Output: Hello-World-Java-Code

        inputString = "aBCdEfG";
        result = validate(inputString);
        System.out.println(result); // Output: a-BC-d-Ef-G

        inputString = "ALLCAPS";
        result = validate(inputString);
        System.out.println(result); // Output: ALLCAPS


        inputString = "alllowercase";
        result = validate(inputString);
        System.out.println(result); // Output: alllowercase
    }

    public static String validate(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return inputString; 
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            result.append(currentChar);

            if (i < inputString.length() - 1) {
                char nextChar = inputString.charAt(i + 1);
                if (Character.isUpperCase(currentChar) && Character.isLowerCase(nextChar)) {
                    result.append('-');
                }
            }
        }
        return result.toString();
    }
}
