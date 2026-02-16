public class RemoveCharacter {

    public static void main(String[] args) {
        String str = "hello world";
        char charToRemove = 'l';
        String newStr = remove_Character(str, charToRemove);
        System.out.println(newStr); // Output: heo word

        str = "programming";
        charToRemove = 'm';
        newStr = remove_Character(str, charToRemove);
        System.out.println(newStr); // Output: prograing
    }

    public static String remove_Character(String str, char charToRemove) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charToRemove) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
