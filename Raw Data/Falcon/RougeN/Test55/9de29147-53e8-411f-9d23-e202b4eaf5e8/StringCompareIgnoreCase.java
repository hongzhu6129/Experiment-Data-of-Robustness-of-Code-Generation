public class StringCompareIgnoreCase {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        String str3 = "apple";
        String str4 = "Banana";


        int result1 = str1.compareToIgnoreCase(str2);
        int result2 = str1.compareToIgnoreCase(str3);
        int result3 = str3.compareToIgnoreCase(str4);

        System.out.println("\"" + str1 + "\" compared to \"" + str2 + "\": " + result1); // Output: 0 (equal)
        System.out.println("\"" + str1 + "\" compared to \"" + str3 + "\": " + result2); // Output: > 0 (str1 comes after str3)
        System.out.println("\"" + str3 + "\" compared to \"" + str4 + "\": " + result3); // Output: < 0 (str3 comes before str4)



        // Demonstrating different cases with explanations

        String s1 = "apple";
        String s2 = "Apple";
        String s3 = "banana";
        String s4 = "zebra";

        System.out.println("\nMore examples:");


        System.out.println(s1.compareToIgnoreCase(s2)); // 0 (equal ignoring case)
        System.out.println(s1.compareToIgnoreCase(s3)); // Negative (s1 comes before s3)
        System.out.println(s1.compareToIgnoreCase(s4)); // Negative (s1 comes before s4)
        System.out.println(s4.compareToIgnoreCase(s1)); // Positive (s4 comes after s1)
        System.out.println("Orange".compareToIgnoreCase("apple")); // Positive ("Orange" comes after "apple")





    }
}
