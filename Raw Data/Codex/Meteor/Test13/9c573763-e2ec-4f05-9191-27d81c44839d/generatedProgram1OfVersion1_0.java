public class DifferentIdentifierSameString {

  public static void main(String[] args) {
    // Create two String objects with the same value
    String s1 = "Hello";
    String s2 = "Hello";

    // Check if the two strings are the same object
    System.out.println(s1 == s2); // Output: false

    // Create another identifier for the same string object
    String s3 = s1;

    // Check if the three strings are the same object
    System.out.println(s1 == s3); // Output: true
    System.out.println(s2 == s3); // Output: true
  }
}
