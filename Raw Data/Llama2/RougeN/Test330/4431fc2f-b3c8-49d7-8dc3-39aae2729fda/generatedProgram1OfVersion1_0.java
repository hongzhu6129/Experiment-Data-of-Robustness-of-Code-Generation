public class StringManipulation {

    public String withoutMatch(String str) {
        if (str.length() < 2) {
            return str; // Not enough characters for a substring of length 2
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

        System.out.println(sm.withoutMatch("HelloHe")); // Output: lloHe
        System.out.println(sm.withoutMatch("abXYab"));  // Output: XYab
        System.out.println(sm.withoutMatch("Hi"));     // Output: Hi
        System.out.println(sm.withoutMatch("x"));      // Output: x
        System.out.println(sm.withoutMatch("HeHe"));   // Output: He
        System.out.println(sm.withoutMatch(""));       // Output: 
       
    }
}
