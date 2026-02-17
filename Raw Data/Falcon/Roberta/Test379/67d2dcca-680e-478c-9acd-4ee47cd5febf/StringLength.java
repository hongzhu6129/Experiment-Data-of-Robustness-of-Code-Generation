// Java program to get the length of a given string

public class StringLength {

    public static void main(String[] args) {
        // Test cases
        String str1 = "Hello, world!";
        String str2 = "";
        String str3 = null;

        // Get the length of each string
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3 == null ? 0 : str3.length();

        // Print the lengths
        System.out.println("The length of str1 is: " + len1);
        System.out.println("The length of str2 is: " + len2);
        System.out.println("The length of str3 is: " + len3);
    }
}
