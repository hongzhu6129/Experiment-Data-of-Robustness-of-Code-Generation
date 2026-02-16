public class StringSplitter {

    static void splitString(String str, int n) {
        if (str == null || str.isEmpty()) {
            System.out.println("Input string is empty.");
            return;
        }

        int strLength = str.length();

        if (n <= 0) {
            System.out.println("Invalid value of n.  n must be greater than 0.");
            return;
        }


        if (strLength % n != 0) {
            System.out.println("String cannot be divided into " + n + " equal parts.");
            return; // Or handle it differently, e.g., by adding padding or discarding extra characters
        }

        int partSize = strLength / n;

        for (int i = 0; i < n; i++) {
            int startIndex = i * partSize;
            int endIndex = (i + 1) * partSize; // Exclusive end index
            String part = str.substring(startIndex, endIndex);
            System.out.println(part);
        }
    }



    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwx"; // Example string
        int n = 4; // Number of parts

        System.out.println("Dividing '" + str + "' into " + n + " parts:");
        splitString(str, n);


        System.out.println("\nAnother Example:");
        splitString("HelloWorld", 2); // Example with two parts

        System.out.println("\nExample with empty string:");
        splitString("", 3);


        System.out.println("\nExample with invalid n:");
        splitString("abcdef", 0);

         System.out.println("\nExample where string can't be equally divided:");
         splitString("abcdefg", 3);


    }
}
