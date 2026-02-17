public class MiddleCharacter {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String str3 = "a";
        String str4 = "";

        System.out.println("Middle of \"" + str1 + "\": " + middle(str1)); // ll
        System.out.println("Middle of \"" + str2 + "\": " + middle(str2)); // r
        System.out.println("Middle of \"" + str3 + "\": " + middle(str3)); // a
        System.out.println("Middle of \"" + str4 + "\": " + middle(str4)); // "" (empty string)

    }

    public static String middle(String str) {
        if (str.length() == 0) {
            return ""; // Handle empty strings
        }

        int middleIndex = str.length() / 2;

        if (str.length() % 2 == 0) { // Even length
            return str.substring(middleIndex - 1, middleIndex + 1); 
        } else { // Odd length
            return str.substring(middleIndex, middleIndex + 1);
        }
    }
}
