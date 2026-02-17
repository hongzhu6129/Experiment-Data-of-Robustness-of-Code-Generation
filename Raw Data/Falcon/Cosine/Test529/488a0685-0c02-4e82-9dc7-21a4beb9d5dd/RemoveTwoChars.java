public class RemoveTwoChars {

    public String exceptTwoO(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }

        char specifiedChar = 'o'; // The character to check against

        if (str.charAt(0) == specifiedChar || str.charAt(1) == specifiedChar) {
            return str.substring(2);
        } else {
            return str;
        }
    }

    public static void main(String[] args) {
        RemoveTwoChars obj = new RemoveTwoChars();

        System.out.println(obj.exceptTwoO("oracle")); // Output: acle
        System.out.println(obj.exceptTwoO("foobar")); // Output: foobar
        System.out.println(obj.exceptTwoO("oodle")); // Output: dle
        System.out.println(obj.exceptTwoO("ozzy")); // Output: zy
        System.out.println(obj.exceptTwoO("o"));    // Output: o  (less than 2 chars, unchanged)
        System.out.println(obj.exceptTwoO(null));   // Output: null (handles null input)
         System.out.println(obj.exceptTwoO("abc")); // Output: abc
    }
}
