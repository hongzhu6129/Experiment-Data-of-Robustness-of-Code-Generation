public class RemoveCharacter {

    public static void main(String[] args) {
        String originalString = "programming";
        char charToRemove = 'r';

        String modifiedString = remove_Character(originalString, charToRemove);

        System.out.println("Original string: " + originalString);
        System.out.println("Modified string: " + modifiedString);


        originalString = "hello world";
        charToRemove = 'o';
        modifiedString = remove_Character(originalString, charToRemove);
        System.out.println("Original string: " + originalString);
        System.out.println("Modified string: " + modifiedString);


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
