public class StringMixer {

    public String stringMixing(String str1, String str2) {
        StringBuilder mixedString = new StringBuilder();
        int len1 = str1.length();
        int len2 = str2.length();
        int i = 0, j = 0;

        while (i < len1 || j < len2) {
            if (i < len1) {
                mixedString.append(str1.charAt(i));
                i++;
            }
            if (j < len2) {
                mixedString.append(str2.charAt(j));
                j++;
            }
        }
        return mixedString.toString();
    }

    public static void main(String[] args) {
        StringMixer mixer = new StringMixer();
        String str1 = "abc";
        String str2 = "pqr";
        String mixed = mixer.stringMixing(str1, str2);
        System.out.println(mixed); // Output: apbqcr


        str1 = "Hello";
        str2 = "World";
        mixed = mixer.stringMixing(str1, str2);
        System.out.println(mixed); // Output: HWeolrllod
    }
}
