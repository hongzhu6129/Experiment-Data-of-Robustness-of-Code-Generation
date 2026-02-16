public class MiddleCharacter {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "java";
        String str3 = "coding";

        System.out.println("Middle of '" + str1 + "': " + middle(str1)); // Output: l
        System.out.println("Middle of '" + str2 + "': " + middle(str2)); // Output: av
        System.out.println("Middle of '" + str3 + "': " + middle(str3)); // Output: d
        System.out.println("Middle of '" + "" + "': " + middle("")); // Output: "" (empty string)

    }

    public static String middle(String str) {
        int length = str.length();
        if (length == 0) {
            return ""; // Handle empty string case
        }

        if (length % 2 == 0) {
            // Even length: Return two middle characters
            int middleIndex1 = length / 2 - 1;
            int middleIndex2 = length / 2;
            return str.substring(middleIndex1, middleIndex2 + 1);
        } else {
            // Odd length: Return single middle character
            int middleIndex = length / 2;
            return str.substring(middleIndex, middleIndex + 1);
        }
    }
}
