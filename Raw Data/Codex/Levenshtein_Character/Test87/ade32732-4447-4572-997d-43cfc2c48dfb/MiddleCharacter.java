public class MiddleCharacter {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "java";
        String str3 = "coding";

        System.out.println("Middle character of \"" + str1 + "\": " + middle(str1));
        System.out.println("Middle character of \"" + str2 + "\": " + middle(str2));
        System.out.println("Middle character of \"" + str3 + "\": " + middle(str3));
    }

    public static String middle(String str) {
        int len = str.length();
        int middleIndex = len / 2;

        if (len % 2 == 0) { // Even length
            return str.substring(middleIndex - 1, middleIndex + 1); 
        } else { // Odd length
            return str.substring(middleIndex, middleIndex + 1);
        }
    }
}
