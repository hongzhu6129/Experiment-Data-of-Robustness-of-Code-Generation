public class ExpressionEvaluator {

    public static void main(String[] args) {
        System.out.println("a) " + evaluateA());
        System.out.println("b) " + evaluateB());
        System.out.println("c) " + evaluateC());
        System.out.println("d) " + evaluateD());
        System.out.println("e) " + evaluateE());
        System.out.println("f) " + evaluateF());

    }

    public static double evaluateA() {
        return (101 + 0) / 3.0; // Need 3.0 to ensure double division
    }

    public static double evaluateB() {
        return 3.0e-6 * 10000000.1;
    }

    public static boolean evaluateC() {
        return true && true;
    }

    public static boolean evaluateD() {
        return false && true;
    }

    public static boolean evaluateE() {
        return (false && false) || (true && true);
    }

    public static boolean evaluateF() {
        return (false || false) && (true && true);
    }
}
