public class RemoveCharacter {

    public static void main(String[] args) {
        String str = "This is a test string.";
        char charToRemove = 's';

        String result = remove_Character(str, charToRemove);
        System.out.println("Original string: " + str);
        System.out.println("String after removing '" + charToRemove + "': " + result);


        str = "Another example string";
        charToRemove = 'x';
        result = remove_Character(str, charToRemove);
        System.out.println("Original string: " + str);
        System.out.println("String after removing '" + charToRemove + "': " + result);

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
