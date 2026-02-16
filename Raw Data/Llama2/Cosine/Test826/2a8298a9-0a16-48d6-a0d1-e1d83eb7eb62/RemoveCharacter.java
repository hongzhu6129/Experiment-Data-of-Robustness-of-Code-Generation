public class RemoveCharacter {

    public static void main(String[] args) {
        String str1 = "w3resource.com";
        char ch = 'r';
        String newStr = remove_Character(str1, ch);
        System.out.println(newStr);  // Output: w3esouce.com

        str1 = "w3resource.com";
        ch = 'c';
        newStr = remove_Character(str1, ch);
        System.out.println(newStr); // Output: w3resoure.om

        str1 = "Google";
        ch = 'o';
        newStr = remove_Character(str1, ch);
        System.out.println(newStr); // Output: Ggle

       
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
