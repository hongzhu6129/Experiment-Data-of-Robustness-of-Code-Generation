public class StringWithoutMatch {

    public String withoutMacth(String str) {
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

        System.out.println(swm.withoutMacth("HelloHe")); // Output: lloHe
        System.out.println(swm.withoutMacth("Hello")); // Output: Hello
        System.out.println(swm.withoutMacth("He")); // Output: He
        System.out.println(swm.withoutMacth("xHix")); // Output: ix
        System.out.println(swm.withoutMacth("xHi")); // Output: xHi
        System.out.println(swm.withoutMacth(""));  // Output: ""
        System.out.println(swm.withoutMacth("abcab")); //Output: cab


    }
}
