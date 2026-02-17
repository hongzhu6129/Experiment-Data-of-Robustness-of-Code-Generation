public class StringSplitter {

    static void splitString(String str, int n) {
        if (str == null || str.isEmpty()) {
            System.out.println("Input string cannot be null or empty.");
            return;
        }

        int strLen = str.length();

        if (n <= 0) {
            System.out.println("Number of parts (n) must be greater than 0.");
            return;
        }


        if (strLen < n) {
            System.out.println("The string length is less than the number of parts (n). Cannot split evenly.");
            return;
        }

        int partSize = strLen / n;
        int remainder = strLen % n; // Calculate the remainder for even distribution


        int startIndex = 0;
        for (int i = 0; i < n; i++) {
            int endIndex = startIndex + partSize ;

            // Distribute the remainder across the parts as evenly as possible
            if (remainder > 0) {
                endIndex++;
                remainder--;
            }

            System.out.println(str.substring(startIndex, endIndex));
            startIndex = endIndex;
        }
    }


    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxy";
        int n = 3;
        splitString(str, n);

        System.out.println("----"); // Separator


        str = "abcdefghijklm";
        n = 4;
        splitString(str, n);


         System.out.println("----");

        str = "abc";  // Example where string length < n
        n = 4;
        splitString(str,n);


        System.out.println("----");

        str = "abcdef";  // Example with remainder
        n = 5;
        splitString(str,n);



        System.out.println("----"); // Separator
        // Test with null or empty string:
        str = "";
        n = 3;
        splitString(str, n);




        System.out.println("----");
        str = "abcdef";
        n = 0; //invalid n
        splitString(str, n);




    }
}
