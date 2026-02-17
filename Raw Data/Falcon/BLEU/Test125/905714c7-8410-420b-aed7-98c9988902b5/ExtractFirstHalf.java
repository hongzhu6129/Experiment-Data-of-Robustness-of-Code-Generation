public class ExtractFirstHalf {

    public static void main(String[] args) {
        String str = "pythonpyt"; // Test data

        if (str.length() % 2 == 0) { // Check if the string length is even
            int halfLength = str.length() / 2;
            String firstHalf = str.substring(0, halfLength);
            System.out.println(firstHalf);
        } else {
            System.out.println("String length is not even.");
        }

        // Example with another even length string
        String str2 = "abcdef";
        if (str2.length() % 2 == 0) {
            int halfLength = str2.length() / 2;
            String firstHalf = str2.substring(0, halfLength);
            System.out.println(firstHalf);
        } else {
            System.out.println("String length is not even.");
        }

          // Example with an odd length string
        String str3 = "abcdefg";
        if (str3.length() % 2 == 0) {
            int halfLength = str3.length() / 2;
            String firstHalf = str3.substring(0, halfLength);
            System.out.println(firstHalf);
        } else {
            System.out.println("String length is not even.");
        }


    }
}
