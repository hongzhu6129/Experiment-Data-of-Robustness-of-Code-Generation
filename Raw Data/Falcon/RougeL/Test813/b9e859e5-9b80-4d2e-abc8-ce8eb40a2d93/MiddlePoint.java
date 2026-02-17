public class MiddlePoint {

    public static void main(String[] args) {
        // Test cases
        System.out.println(test(2, 4, 6)); // False
        System.out.println(test(4, 6, 2)); // False
        System.out.println(test(2, 4, 3)); // True
        System.out.println(test(4, 2, 3)); // True
        System.out.println(test(2, 6, 4)); // True
        System.out.println(test(5, 5, 5)); // True -  as per the problem description, if all numbers are equal it's still considered true since any one can be the midpoint.
        System.out.println(test(1, 5, 9)); // False

    }

    public static boolean test(int a, int b, int c) {
        // Check if any one number is the average of the other two
        if ((a + b) / 2.0 == c || (a + c) / 2.0 == b || (b + c) / 2.0 == a) {
            return true;
        }
        return false;
    }
}
