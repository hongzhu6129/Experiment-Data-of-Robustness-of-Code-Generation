class RemoveCharacter {

    public static void main(String[] args) {
        String str = "This is a test string.";
        char charToRemove = 's';

        String newStr = remove_Character(str, charToRemove);
        System.out.println("Original string: " + str);
        System.out.println("New string: " + newStr);


        str = "Another example string.";
        charToRemove = 'e';
        newStr = remove_Character(str, charToRemove);
        System.out.println("Original string: " + str);
        System.out.println("New string: " + newStr);


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
