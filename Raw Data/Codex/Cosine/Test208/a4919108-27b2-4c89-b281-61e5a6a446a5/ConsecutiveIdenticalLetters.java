public class ConsecutiveIdenticalLetters {

    public static void main(String[] args) {
        System.out.println(test("aabbccd")); // true
        System.out.println(test("abcded")); // false
        System.out.println(test("aabbccee")); // true
        System.out.println(test("jjklopp")); // true
        System.out.println(test("jkloppp")); // true
        System.out.println(test("")); // false 
        System.out.println(test("a")); // false
    }


    public static boolean test(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
