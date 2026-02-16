public class RemoveCharacter {

    public static void main(String[] args) {
        String originalString = "hello world";
        char charToRemove = 'o';

        String modifiedString = remove_Character(originalString, charToRemove);
        System.out.println(modifiedString); // Output: hell wrld


        originalString = "programming";
        charToRemove = 'r';
        modifiedString = remove_Character(originalString, charToRemove);
        System.out.println(modifiedString); // Output: pogamming
    }

    public static String remove_Character(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
