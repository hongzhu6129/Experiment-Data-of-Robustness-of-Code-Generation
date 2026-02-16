public class RemoveCharacter {

    public String removeAllZ(String str) {
        if (str == null || str.length() <= 2) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0)); // Append the first character

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'z') {  // Check if the character is 'z'
                sb.append(str.charAt(i));
            }
        }

        sb.append(str.charAt(str.length() - 1)); // Append the last character

        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveCharacter remover = new RemoveCharacter();

        String str1 = "zebrazone";
        String result1 = remover.removeAllZ(str1);
        System.out.println("Original String: " + str1);
        System.out.println("Modified String: " + result1); // Output: zebrone

        String str2 = "zzz";
        String result2 = remover.removeAllZ(str2);
        System.out.println("Original String: " + str2);
        System.out.println("Modified String: " + result2); // Output: zzz


        String str3 = "z";
        String result3 = remover.removeAllZ(str3);
        System.out.println("Original String: " + str3);
        System.out.println("Modified String: " + result3); // Output: z

         String str4 = null;
        String result4 = remover.removeAllZ(str4);
        System.out.println("Original String: " + str4);
        System.out.println("Modified String: " + result4); // Output: null

        String str5 = "aza";
        String result5 = remover.removeAllZ(str5);
        System.out.println("Original String: " + str5);
        System.out.println("Modified String: " + result5); // Output: aza

    }
}
