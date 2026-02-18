public class CopilotTest {
    public static void main(String[] args) {
        String input = "java";
        String output = convertToUppercase(input);
        System.out.println(output);
    }

    public static String convertToUppercase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}