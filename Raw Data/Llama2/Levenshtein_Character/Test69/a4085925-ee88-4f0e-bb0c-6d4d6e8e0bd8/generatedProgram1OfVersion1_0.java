public class ExpressionEvaluator {

    public static double evaluateExpressionA() {
        return (101 + 0) / 3.0; // Note: 3.0 to ensure double division
    }

    public static double evaluateExpressionB() {
        return 3.0e-6 * 10000000.1;
    }

    public static boolean evaluateExpressionC() {
        return true && true;
    }

    public static boolean evaluateExpressionD() {
        return false && true;
    }

    public static boolean evaluateExpressionE() {
        return (false && false) || (true && true);
    }

    public static boolean evaluateExpressionF() {
        return (false || false) && (true && true);
    }

    public static void main(String[] args) {
        System.out.println("a) " + evaluateExpressionA());
        System.out.println("b) " + evaluateExpressionB());
        System.out.println("c) " + evaluateExpressionC());
        System.out.println("d) " + evaluateExpressionD());
        System.out.println("e) " + evaluateExpressionE());
        System.out.println("f) " + evaluateExpressionF());
    }
}
