import java.util.Arrays;

public class StringComparison {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        // Check if the strings are equal using == operator
        if (str1 == str2) {
            System.out.println("str1 and str2 are the same object");
        } else {
            System.out.println("str1 and str2 are not the same object");
        }

        // Check if the strings are equal using equals() method
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are not equal");
        }

        // Check if the strings are equal using Arrays.equals() method
        if (Arrays.equals(str1.toCharArray(), str2.toCharArray())) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are not equal");
        }

        // Check if the strings are equal using compareTo() method
        if (str1.compareTo(str2) == 0) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are not equal");
        }

        // Check if the strings are equal using intern() method
        if (str1.intern() == str2.intern()) {
            System.out.println("str1 and str2 are the same object");
        } else {
            System.out.println("str1 and str2 are not the same object");
        }

        // Check if the strings are equal using contentEquals() method
        if (str1.contentEquals(str2)) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are not equal");
        }

        // Check if the strings are equal using == operator
        if (str1 == str3) {
            System.out.println("str1 and str3 are the same object");
        } else {
            System.out.println("str1 and str3 are not the same object");
        }

        // Check if the strings are equal using equals() method
        if (str1.equals(str3)) {
            System.out.println("str1 and str3 are equal");
        } else {
            System.out.println("str1 and str3 are not equal");
        }

        // Check if the strings are equal using Arrays.equals() method
        if (Arrays.equals(str1.toCharArray(), str3.toCharArray())) {
            System.out.println("str1 and str3 are equal");
        } else {
            System.out.println("str1 and str3 are not equal");
        }

        // Check if the strings are equal using compareTo() method
        if (str1.compareTo(str3) == 0) {
            System.out.println("str1 and str3 are equal");
        } else {
            System.out.println("str1 and str3 are not equal");
        }

        // Check if the strings are equal using intern() method
        if (str1.intern() == str3.intern()) {
            System.out.println("str1 and str3 are the same object");
        } else {
            System.out.println("str1 and str3 are not the same object");
        }

        // Check if the strings are equal using contentEquals() method
        if (str1.contentEquals(str3)) {
            System.out.println("str1 and str3 are equal");
        } else {
            System.out.println("str1 and str3 are not equal");
        }
    }
}
