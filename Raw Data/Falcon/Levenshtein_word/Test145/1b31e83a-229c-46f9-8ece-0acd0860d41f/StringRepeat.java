public class StringRepeat {

    public String lastNchrRepeat(String str, int n) {
        if (str == null || str.isEmpty() || n <= 0) {
            return ""; // Handle invalid input
        }

        int len = str.length();
        if (n > len) {
            n = len; // Adjust n if it's greater than string length
        }

        String lastN = str.substring(len - n);
        return lastN.repeat(n); 
    }

    public static void main(String[] args) {
        StringRepeat repeater = new StringRepeat();

        System.out.println(repeater.lastNchrRepeat("Wipro", 3));    // Output: propropro
        System.out.println(repeater.lastNchrRepeat("hello", 2));    // Output: llll
        System.out.println(repeater.lastNchrRepeat("Java", 1));     // Output: a
        System.out.println(repeater.lastNchrRepeat("apple", 6));   // Output: appleappleappleappleappleapple
        System.out.println(repeater.lastNchrRepeat("", 2));       // Output: ""
        System.out.println(repeater.lastNchrRepeat(null, 2));     // Output: ""
        System.out.println(repeater.lastNchrRepeat("test", 0));     // Output: ""

    }
}
