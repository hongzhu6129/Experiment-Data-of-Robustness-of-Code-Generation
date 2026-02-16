public class MiddleCharacter {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "java";
        String str3 = "";
        String str4 = "A";

        System.out.println("Middle of '" + str1 + "': " + middle(str1)); // Output: l
        System.out.println("Middle of '" + str2 + "': " + middle(str2)); // Output: av
        System.out.println("Middle of '" + str3 + "': " + middle(str3)); // Output: ""
        System.out.println("Middle of '" + str4 + "': " + middle(str4)); // Output: A

    }

    public static String middle(String str) {
        if (str.length() == 0) {
            return "";
        }

        int middleIndex = str.length() / 2;

        if (str.length() % 2 == 0) { // Even length
            if (middleIndex > 0) {
                return str.substring(middleIndex - 1, middleIndex + 1);
            } else {
                return str.substring(0, 1);
            }

        } else { // Odd length
            return String.valueOf(str.charAt(middleIndex));
        }
    }
}
