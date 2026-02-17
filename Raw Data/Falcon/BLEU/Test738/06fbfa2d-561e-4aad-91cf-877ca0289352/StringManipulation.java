public class StringManipulation {

    public String mAndTstring(String mainString, String subString) {
        int index = mainString.indexOf(subString);

        if (index == -1) {
            return ""; // Substring not found
        }

        StringBuilder result = new StringBuilder();

        if (index > 0) {
            result.append(mainString.charAt(index - 1));
        }

        if (index + subString.length() < mainString.length()) {
            result.append(mainString.charAt(index + subString.length()));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        StringManipulation obj = new StringManipulation();

        System.out.println(obj.mAndTstring("Python", "th")); // Output: o
        System.out.println(obj.mAndTstring("JavaScript", "S")); // Output: a
        System.out.println(obj.mAndTstring("Hello", "ell")); // Output: Ho
        System.out.println(obj.mAndTstring("Java", "v")); // Output: aa
        System.out.println(obj.mAndTstring("Coding", "ing")); // Output: d // Substring at the end
         System.out.println(obj.mAndTstring("Test", "Te")); // Output: s // Substring at the beginning
        System.out.println(obj.mAndTstring("xyz", "abc")); // Output:  (empty string, substring not found)




    }
}
