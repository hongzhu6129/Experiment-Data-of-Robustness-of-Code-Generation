public class StringCompareIgnoreCase {

    public static void main(String[] args) {
        String string1 = "apple";
        String string2 = "Apple";
        String string3 = "banana";

        compareStrings(string1, string2); // Expected: apple and Apple are equal (ignoring case)
        compareStrings(string1, string3); // Expected: apple comes before banana
        compareStrings(string3, string1); // Expected: banana comes after apple
        compareStrings(null, string1);    // Expected: null comes before apple 
        compareStrings(string1, null);    // Expected: apple comes after null
        compareStrings(null, null);       // Expected: null and null are equal

    }

    public static void compareStrings(String str1, String str2) {
        int comparisonResult = compareIgnoreCase(str1, str2);

        if (comparisonResult == 0) {
            System.out.println((str1 == null ? "null" : str1) + " and " + (str2 == null ? "null" : str2) + " are equal (ignoring case)");
        } else if (comparisonResult < 0) {
            System.out.println((str1 == null ? "null" : str1) + " comes before " + (str2 == null ? "null" : str2));
        } else {
            System.out.println((str1 == null ? "null" : str1) + " comes after " + (str2 == null ? "null" : str2));
        }
    }

    //Helper function to handle nulls safely
    private static int compareIgnoreCase(String str1, String str2) {
         if (str1 == null && str2 == null) {
            return 0;
        } else if (str1 == null) {
            return -1; // null is considered less than any non-null string
        } else if (str2 == null) {
            return 1;  // Any non-null string is considered greater than null
        } else {
            return str1.compareToIgnoreCase(str2); 
        }
    }

}
