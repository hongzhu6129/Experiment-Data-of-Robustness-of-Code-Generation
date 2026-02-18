public class MiddleCharacter {

    public static void main(String[] args) {
        System.out.println(middle("hello")); // ll
        System.out.println(middle("world")); // r
        System.out.println(middle("even")); // ve
        System.out.println(middle("A")); // A
        System.out.println(middle("")); // (empty string) 
    }

    public static String middle(String str) {
        int len = str.length();
        if (len == 0) {
            return ""; // Handle empty string case
        }
        
        int middleIndex = len / 2;

        if (len % 2 == 0) { // Even length
            return str.substring(middleIndex - 1, middleIndex + 1);
        } else { // Odd length
            return str.substring(middleIndex, middleIndex + 1);
        }
    }
}
