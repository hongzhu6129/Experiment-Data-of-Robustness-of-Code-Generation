public class MoveString {

    public static void moveString(String str, int n) {
        if (n == 0) {
            System.out.println(str);
        } else {
            char ch = str.charAt(0);
            String ros = str.substring(1);
            moveString(ros, n - 1);
            System.out.println(ch + ros);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        int n = 2;
        moveString(str, n);
    }
}
