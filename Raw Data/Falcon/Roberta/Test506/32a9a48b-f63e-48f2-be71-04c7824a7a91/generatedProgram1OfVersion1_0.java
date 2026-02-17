public class RemoveCharacter {

    public static void main(String[] args) {
        String str = "This is a test string.";
        char ch = 's';

        String newStr = remove_Character(str, ch);

        System.out.println("Original string: " + str);
        System.out.println("String after removing '" + ch + "': " + newStr);


        str = "Another example string";
        ch = 'e';
         newStr = remove_Character(str, ch);

        System.out.println("Original string: " + str);
        System.out.println("String after removing '" + ch + "': " + newStr);

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
