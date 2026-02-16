public class RemoveCharacter {

    public static void main(String[] args) {
        String str1 = "hello world";
        char charToRemove = 'l';
        String result1 = remove_Character(str1, charToRemove);
        System.out.println("Original string: " + str1);
        System.out.println("String after removing '" + charToRemove + "': " + result1);


        String str2 = "programming";
        char charToRemove2 = 'm';
        String result2 = remove_Character(str2, charToRemove2);
        System.out.println("\nOriginal string: " + str2);
        System.out.println("String after removing '" + charToRemove2 + "': " + result2);

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
