public class StringSplitter {

    static void splitString(String str, int n) {
        if (str == null || str.isEmpty()) {
            System.out.println("Input string cannot be null or empty.");
            return;
        }

        int strLength = str.length();

        if (n <= 0) {
            System.out.println("Number of parts (n) must be greater than 0.");
            return;
        }


        if (strLength % n != 0) {
            System.out.println("The string length is not divisible by n. Cannot split equally.");
            return;
        }

        int partSize = strLength / n;

        for (int i = 0; i < strLength; i += partSize) {
            System.out.println(str.substring(i, i + partSize));
        }

    }


    public static void main(String[] args) {

        String str1 = "abcdefghijklmnopqrst";
        int n1 = 4;
        splitString(str1, n1); // Output: abcd, efgh, ijkl, mnop, qrst

        System.out.println("----");

        String str2 = "helloworld";
        int n2 = 2;
        splitString(str2, n2); // Output: hello, world

        System.out.println("----");
        
        String str3 = "programming";
        int n3 = 3;  // Not evenly divisible
        splitString(str3, n3); // Output: Error message

        System.out.println("----");

        splitString(null, 2); // Output: Error message

        System.out.println("----");

        splitString("test", 0); // Output: Error message


    }
}
