public class RemoveCharacter {

    public static void main(String[] args) {
        String str = "This is a test string.";
        char charToRemove = 's';

        String modifiedString = remove_Character(str, charToRemove);
        System.out.println("Original string: " + str);
        System.out.println("Modified string: " + modifiedString);


        str = "Another example string.";
        charToRemove = 'e';
        modifiedString = remove_Character(str, charToRemove);
        System.out.println("Original string: " + str);
        System.out.println("Modified string: " + modifiedString);
    }

    public static String remove_Character(String str, char charToRemove) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar != charToRemove) {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }
}
