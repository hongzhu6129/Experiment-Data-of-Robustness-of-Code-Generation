public class ExpressionEvaluator {

    public static void main(String[] args) {
        // a) 101 + 0) / 3
        double resultA = evaluateExpressionA();
        System.out.println("a) Result: " + resultA);

        // b) 3.0e-6 * 10000000.1
        double resultB = evaluateExpressionB();
        System.out.println("b) Result: " + resultB);

        // c) true && true
        boolean resultC = evaluateExpressionC();
        System.out.println("c) Result: " + resultC);

        // d) false && true
        boolean resultD = evaluateExpressionD();
        System.out.println("d) Result: " + resultD);

        // e) (false && false) || (true && true)
        boolean resultE = evaluateExpressionE();
        System.out.println("e) Result: " + resultE);

        // f) (false || false) && (true && true)
        boolean resultF = evaluateExpressionF();
        System.out.println("f) Result: " + resultF);
    }

    public static double evaluateExpressionA() {
        return (101 + 0) / 3.0; // Note: 3.0 to ensure floating-point division
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
}
