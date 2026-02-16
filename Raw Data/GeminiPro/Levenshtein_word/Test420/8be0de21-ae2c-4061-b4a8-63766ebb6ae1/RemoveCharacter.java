public class RemoveCharacter {

    public static void main(String[] args) {
        String str = "This is a test string.";
        char charToRemove = 's';

        String newStr = remove_Character(str, charToRemove);

        System.out.println("Original string: " + str);
        System.out.println("New string: " + newStr);


        // Additional test cases
        System.out.println(remove_Character("hello", 'l')); // heo
        System.out.println(remove_Character("world", 'w')); // orld
        System.out.println(remove_Character("", 'a')); // "" (empty string)
        System.out.println(remove_Character("apple", 'p')); // ale

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
