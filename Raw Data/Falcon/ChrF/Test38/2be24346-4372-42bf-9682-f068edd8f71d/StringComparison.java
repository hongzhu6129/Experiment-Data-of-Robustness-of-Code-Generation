import java.util.Objects;

public class StringComparison {

    public static void main(String[] args) {
        // Create three String objects with the same data
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "Hello".intern();

        // Compare the three strings using ==
        System.out.println("str1 == str2: " + (str1 == str2)); // false
        System.out.println("str2 == str3: " + (str2 == str3)); // false
        System.out.println("str1 == str3: " + (str1 == str3)); // false

        // Compare the three strings using equals()
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str2.equals(str3): " + str2.equals(str3)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true

        // Compare the three strings using Objects.equals()
        System.out.println("Objects.equals(str1, str2): " + Objects.equals(str1, str2)); // true
        System.out.println("Objects.equals(str2, str3): " + Objects.equals(str2, str3)); // true
        System.out.println("Objects.equals(str1, str3): " + Objects.equals(str1, str3)); // true
    }
}
