public class MiddleCharacter {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String str3 = "a";
        String str4 = "";

        System.out.println("Middle of '" + str1 + "': " + middle(str1)); // ll
        System.out.println("Middle of '" + str2 + "': " + middle(str2)); // r
        System.out.println("Middle of '" + str3 + "': " + middle(str3)); // a
        System.out.println("Middle of '" + str4 + "': " + middle(str4)); // "" (empty string)
    }

    public static String middle(String str) {
        if (str == null || str.isEmpty()) {
            return ""; 
        }

        int len = str.length();
        int middleIndex = len / 2;

        if (len % 2 == 0) { // Even length
             return String.valueOf(str.charAt(middleIndex -1)) + str.charAt(middleIndex) ;
        } else { // Odd length
            return String.valueOf(str.charAt(middleIndex));
        }
    }
}
