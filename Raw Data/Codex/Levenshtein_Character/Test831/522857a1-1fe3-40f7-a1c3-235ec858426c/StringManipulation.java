public class StringManipulation {

    public String withoutMatch(String str) {
        if (str.length() < 2) {
            return str;
        }

        String firstTwo = str.substring(0, 2);
        String lastTwo = str.substring(str.length() - 2);

        if (firstTwo.equals(lastTwo)) {
            return str.substring(2);
        } else {
            return str;
        }
    }

    public static void main(String[] args) {
        StringManipulation sm = new StringManipulation();

        System.out.println(sm.withoutMatch("Hellolo")); // Output: llolo
        System.out.println(sm.withoutMatch("abcab"));  // Output: cab
        System.out.println(sm.withoutMatch("abc"));    // Output: abc
        System.out.println(sm.withoutMatch("a"));     // Output: a
        System.out.println(sm.withoutMatch(""));      // Output: 
        System.out.println(sm.withoutMatch("edited"));  // Output: edited

    }
}
