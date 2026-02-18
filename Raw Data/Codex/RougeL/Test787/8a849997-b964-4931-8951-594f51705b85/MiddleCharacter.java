public class MiddleCharacter {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String str3 = "a";
        String str4 = "";


        System.out.println(str1 + ": " + middle(str1)); // Output: hello: l
        System.out.println(str2 + ": " + middle(str2)); // Output: world: r
        System.out.println(str3 + ": " + middle(str3)); // Output: a: a
        System.out.println(str4 + ": " + middle(str4)); // Output: : 
    }

    public static String middle(String str) {
        if (str.length() == 0) {
            return "";
        }

        int middleIndex = str.length() / 2;
        if (str.length() % 2 == 0) { // Even length
            return String.valueOf(str.charAt(middleIndex -1 )) + String.valueOf(str.charAt(middleIndex));
        } else { // Odd length
            return String.valueOf(str.charAt(middleIndex));
        }
    }
}
