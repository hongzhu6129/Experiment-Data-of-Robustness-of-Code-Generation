class RemoveCharacter {

    public static void main(String[] args) {
        String str1 = "hello world";
        char charToRemove = 'l';

        String result = remove_Character(str1, charToRemove);
        System.out.println(result); // Output: heo word

        String str2 = "programming";
        char charToRemove2 = 'm';

        String result2 = remove_Character(str2, charToRemove2);
        System.out.println(result2); // Output: prograing
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
