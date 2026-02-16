import java.util.Objects;

public class StringComparison {

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello World";

        // Using the equals() method
        if (str1.equals(str2)) {
            System.out.println("The two strings are equal using equals()");
        } else {
            System.out.println("The two strings are not equal using equals()");
        }

        // Using the == operator
        if (str1 == str2) {
            System.out.println("The two strings are equal using ==");
        } else {
            System.out.println("The two strings are not equal using ==");
        }

        // Using the Objects.equals() method
        if (Objects.equals(str1, str2)) {
            System.out.println("The two strings are equal using Objects.equals()");
        } else {
            System.out.println("The two strings are not equal using Objects.equals()");
        }
    }
}
