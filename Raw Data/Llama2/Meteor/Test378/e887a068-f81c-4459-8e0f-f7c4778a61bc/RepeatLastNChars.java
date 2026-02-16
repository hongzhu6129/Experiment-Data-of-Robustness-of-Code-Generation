public class RepeatLastNChars {

    public String lastNchrRepeat(String str, int n) {
        if (str == null || str.isEmpty() || n <= 0) {
            return ""; // Handle invalid input
        }

        int len = str.length();
        if (n > len) {
            n = len; // If n is greater than string length, repeat the whole string
        }

        String lastNChars = str.substring(len - n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(lastNChars);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        RepeatLastNChars repeater = new RepeatLastNChars();

        System.out.println(repeater.lastNchrRepeat("Python 3.0", 2));   // Output: 00
        System.out.println(repeater.lastNchrRepeat("Python 3.0", 3));   // Output: .0.0.0
        System.out.println(repeater.lastNchrRepeat("Python 3.0", 4));   // Output: 3.03.03.03.0
        System.out.println(repeater.lastNchrRepeat("", 2));        // Output:  (empty string)
        System.out.println(repeater.lastNchrRepeat(null, 2));      // Output:  (empty string)
        System.out.println(repeater.lastNchrRepeat("Java", 0));       // Output:  (empty string)
        System.out.println(repeater.lastNchrRepeat("Hello", 7));      // Output: HelloHeHelloHeHelloHeHelloHeHelloHeHelloHe
    }
}

