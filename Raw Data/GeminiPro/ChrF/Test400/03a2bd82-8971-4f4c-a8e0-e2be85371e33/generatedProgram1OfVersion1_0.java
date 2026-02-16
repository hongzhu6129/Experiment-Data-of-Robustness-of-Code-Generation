public class StringMixer {

    public String stringMixing(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < s1.length() || j < s2.length()) {
            if (i < s1.length()) {
                result.append(s1.charAt(i));
                i++;
            }
            if (j < s2.length()) {
                result.append(s2.charAt(j));
                j++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        StringMixer mixer = new StringMixer();
        String s1 = "abc";
        String s2 = "def";
        String mixedString = mixer.stringMixing(s1, s2);
        System.out.println(mixedString); // Output: adbecf

        s1 = "Hello";
        s2 = "World";
        mixedString = mixer.stringMixing(s1, s2);
        System.out.println(mixedString); // Output: HWelollord


        s1 = "Java";
        s2 = ""; // Empty string test
        mixedString = mixer.stringMixing(s1, s2);
        System.out.println(mixedString); // Output: Java


        s1 = "";  // Empty string test
        s2 = "Programming"; 
        mixedString = mixer.stringMixing(s1, s2);
        System.out.println(mixedString); // Output: Programming

    }
}
