import java.util.Arrays;

public class CompareSameMinorTake {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println(compareSameMinorTake(str1, str2)); // false

        str1 = "Hello";
        str2 = "Hello World";

        System.out.println(compareSameMinorTake(str1, str2)); // false

        str1 = "Hello World";
        str2 = "Hello world";

        System.out.println(compareSameMinorTake(str1, str2)); // true

        str1 = "Hello World";
        str2 = "Hello world!";

        System.out.println(compareSameMinorTake(str1, str2)); // false

        str1 = "Hello World!";
        str2 = "Hello World!!!!!";

        System.out.println(compareSameMinorTake(str1, str2)); // false

        str1 = null;
        str2 = null;

        System.out.println(compareSameMinorTake(str1, str2)); // true

        str1 = null;
        str2 = "Hello World!";

        System.out.println(compareSameMinorTake(str1, str2)); // false

        str1 = "Hello World!";
        str2 = null;

        System.out.println(compareSameMinorTake(str1, str2)); // false

        str1 = "";
        str2 = "";

        System.out.println(compareSameMinorTake(str1, str2)); // true

        str1 = "";
        str2 = "Hello World!";

        System.out.println(compareSameMinorTake(str1, str2)); // false

        str1 = "Hello World!";
        str2 = "";

        System.out.println(compareSameMinorTake(str1, str2)); // false
    }

    public static boolean compareSameMinorTake(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return true;
        } else if (str1 == null || str2 == null) {
            return false;
        } else if (str1.equals(str2)) {
            return true;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
