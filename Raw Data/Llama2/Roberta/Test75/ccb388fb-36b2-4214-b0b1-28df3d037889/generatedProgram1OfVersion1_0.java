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
        StringWithoutMatch obj = new StringWithoutMatch();

        System.out.println(obj.withoutMacth("HelloHe")); // Output: lloHe
        System.out.println(obj.withoutMacth("Hello"));  // Output: Hello
        System.out.println(obj.withoutMacth("He"));    // Output: He
        System.out.println(obj.withoutMacth("H"));     // Output: H
        System.out.println(obj.withoutMacth("abcab"));  // Output: cab
        System.out.println(obj.withoutMacth("abXYab")); // Output: XYab


    }
}
