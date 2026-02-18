public class StringCompareIgnoreCase {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        String str3 = "apple";
        String str4 = "banana";

        // Compare str1 and str2 (ignoring case)
        int result1 = str1.compareToIgnoreCase(str2);
        if (result1 == 0) {
            System.out.println(str1 + " and " + str2 + " are equal (ignoring case)");
        } else if (result1 < 0) {
            System.out.println(str1 + " comes before " + str2 + " (ignoring case)");
        } else {
            System.out.println(str1 + " comes after " + str2 + " (ignoring case)");
        }

        // Compare str3 and str4 (ignoring case)
        int result2 = str3.compareToIgnoreCase(str4);
        if (result2 == 0) {
            System.out.println(str3 + " and " + str4 + " are equal (ignoring case)");
        } else if (result2 < 0) {
            System.out.println(str3 + " comes before " + str4 + " (ignoring case)");
        } else {
            System.out.println(str3 + " comes after " + str4 + " (ignoring case)");
        }


        //Example using command line arguments (if provided)
        if (args.length == 2) {
            int result3 = args[0].compareToIgnoreCase(args[1]);
            if (result3 == 0) {
                System.out.println(args[0] + " and " + args[1] + " are equal (ignoring case)");
            } else if (result3 < 0) {
                System.out.println(args[0] + " comes before " + args[1] + " (ignoring case)");
            } else {
                System.out.println(args[0] + " comes after " + args[1] + " (ignoring case)");
            }
        } else if (args.length > 0) {
            System.out.println("Please provide two strings as command-line arguments to compare.");
        } 
    }
}
