public class RemoveCharacter {

    public static void main(String[] args) {
        String str = "hello world";
        char charToRemove = 'o';

        String newStr = remove_Character(str, charToRemove);

        System.out.println("Original string: " + str);
        System.out.println("New string: " + newStr);


        str = "programming";
        charToRemove = 'm';
        newStr = remove_Character(str, charToRemove);

        System.out.println("Original string: " + str);
        System.out.println("New string: " + newStr);
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
