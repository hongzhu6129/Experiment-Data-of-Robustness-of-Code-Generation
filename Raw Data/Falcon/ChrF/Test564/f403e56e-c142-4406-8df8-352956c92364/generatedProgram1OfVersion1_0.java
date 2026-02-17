public class RemoveVowels {

    public static void main(String[] args) {
        String str = "Hello World";
        String updatedStr = validate(str);
        System.out.println(updatedStr); // Output: Hll Wrld

        str = "AEIOUaeiou";
        updatedStr = validate(str);
        System.out.println(updatedStr); // Output: 

        str = "This is a test string.";
        updatedStr = validate(str);
        System.out.println(updatedStr); // Output: Ths s  tst strng.


    }

    public static String validate(String str) {
        if (str == null) {
            return null; 
        }

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!isVowel(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Case-insensitive check
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
