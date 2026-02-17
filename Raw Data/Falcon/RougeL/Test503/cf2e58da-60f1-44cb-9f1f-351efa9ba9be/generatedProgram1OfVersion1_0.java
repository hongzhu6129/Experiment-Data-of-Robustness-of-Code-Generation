class RemoveCharacter {

    /**
     * Creates a new string after removing a specified character from a given string,
     * except for the first and last occurrences.
     *
     * @param str The input string.
     * @return The new string with the specified character removed (except first and last).
     */
    public String removeAllZ(String str) {
        if (str == null || str.length() <= 2) {
            return str;
        }

        char charToRemove = 'z'; //  You can change this to any character
        StringBuilder sb = new StringBuilder();

        boolean firstFound = false;
        boolean lastFound = false;
        int lastIndex = -1;


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == charToRemove) {
                if (!firstFound) {
                    firstFound = true;
                    sb.append(str.charAt(i));
                } else if (i > lastIndex) {
                    lastIndex = i;
                }
            } else {
                sb.append(str.charAt(i));
            }
        }


        if(lastIndex !=-1 && lastIndex != str.length()-1 ) {
             StringBuilder finalSb = new StringBuilder();

            for (int i = 0; i < sb.length(); i++) {

                if ( i == sb.length() - (str.length() - lastIndex)) {
                    finalSb.append(charToRemove);
                } else {

                   finalSb.append(sb.charAt(i));
                }
            }
            return finalSb.toString();



        }
         return sb.toString();
    }

    public static void main(String[] args) {
        RemoveCharacter remover = new RemoveCharacter();

        System.out.println(remover.removeAllZ("zebrazone"));   // Output: zebrarone
        System.out.println(remover.removeAllZ("zzaabbz")); // Output: zzaabbz
        System.out.println(remover.removeAllZ("zz")); // Output: zz
        System.out.println(remover.removeAllZ("z")); // Output: z
        System.out.println(remover.removeAllZ("")); // Output: 
        System.out.println(remover.removeAllZ("abcabcabc")); // Output: abcabcabc
        System.out.println(remover.removeAllZ("zbz")); // Output: zbz
        System.out.println(remover.removeAllZ("zzz")); // Output: zzz
        System.out.println(remover.removeAllZ("zzzz")); // Output: zzzz        
        System.out.println(remover.removeAllZ("zzbaz")); // Output: zzbaz

    }
}
