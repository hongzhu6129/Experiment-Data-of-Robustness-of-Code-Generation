public class StringWithoutMatch {

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
        StringWithoutMatch swm = new StringWithoutMatch();

        System.out.println(swm.withoutMatch("HelloHe")); // Output: lloHe
        System.out.println(swm.withoutMatch("Hello")); // Output: Hello
        System.out.println(swm.withoutMatch("He")); // Output: He
        System.out.println(swm.withoutMatch("xHix")); // Output: xHix
        System.out.println(swm.withoutMatch("Hi")); // Output: 
        System.out.println(swm.withoutMatch("xaxaxaxx")); // Output: xaxaxx
    }
}
