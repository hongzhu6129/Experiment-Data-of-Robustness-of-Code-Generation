public class AddDashesToVowels {

    public static void main(String[] args) {
        String inputString = "hello world"; // Example input
        String result = validate(inputString);
        System.out.println(result); // Output: h-e-ll-o- w-o-rld
    }

    public static String validate(String input) {
        if (input == null) {
            return null; 
        }

        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (isVowel(c)) {
                result.append("-").append(c).append("-");
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Handle both uppercase and lowercase vowels
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
