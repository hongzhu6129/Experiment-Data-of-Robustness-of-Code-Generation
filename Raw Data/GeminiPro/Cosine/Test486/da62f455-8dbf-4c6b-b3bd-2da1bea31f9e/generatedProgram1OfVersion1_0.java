public class MiddleCharacter {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "java";
        String str3 = "coding";

        System.out.println("Middle character(s) of \"" + str1 + "\": " + middle(str1)); // Output: l
        System.out.println("Middle character(s) of \"" + str2 + "\": " + middle(str2)); // Output: av
        System.out.println("Middle character(s) of \"" + str3 + "\": " + middle(str3)); // Output: i
    }

    public static String middle(String str) {
        int length = str.length();
        int middleIndex = length / 2;

        if (length % 2 == 0) { // Even length
            return str.substring(middleIndex - 1, middleIndex + 1); 
        } else { // Odd length
            return str.substring(middleIndex, middleIndex + 1);
        }
    }
}
