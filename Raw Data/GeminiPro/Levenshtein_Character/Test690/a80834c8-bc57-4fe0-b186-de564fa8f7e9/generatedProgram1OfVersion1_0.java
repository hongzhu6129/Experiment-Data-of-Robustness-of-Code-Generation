public class CheckFifteen {

    public static void main(String[] args) {
        // Test cases
        System.out.println(calculate(10, 5));  // True (sum is 15)
        System.out.println(calculate(15, 5));  // True (first number is 15)
        System.out.println(calculate(5, 15));  // True (second number is 15)
        System.out.println(calculate(20, 5));  // True (difference is 15)
        System.out.println(calculate(10, 6));  // False 
        System.out.println(calculate(7, 7));   // False
    }

    public static boolean calculate(int a, int b) {
        if (a == 15 || b == 15) {
            return true;
        }
        if (a + b == 15 || Math.abs(a - b) == 15) { // Use Math.abs for difference
            return true;
        }
        return false;
    }
}
