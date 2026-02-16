public class RemoveCharacter {

    public static void main(String[] args) {
        String str = "This is a test string.";
        char ch = 's';

        String newStr = remove_Character(str, ch);

        System.out.println(newStr); // Output: Thi i a tet tring.

        str = "Another example string";
        ch = 'e';

        newStr = remove_Character(str, ch);
        System.out.println(newStr); // Output: Anothr xampl string


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
