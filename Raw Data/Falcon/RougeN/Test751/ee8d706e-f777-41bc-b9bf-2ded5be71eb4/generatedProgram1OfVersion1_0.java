public class PQBalance {

    public boolean pqBalanceString(String s) {
        if (s == null || s.isEmpty()) {
            return true; // Empty string is considered balanced
        }

        boolean seenP = false;
        for (char c : s.toCharArray()) {
            if (c == 'p') {
                seenP = true;
            } else if (c == 'q') {
                if (!seenP) {
                    return false; // 'q' before 'p'
                }
                seenP = false; // Reset for the next 'p'
            }
        }

        return !seenP; // True if the last 'p' was followed by a 'q'
    }

    public static void main(String[] args) {
        PQBalance checker = new PQBalance();

        System.out.println("pqq: " + checker.pqBalanceString("pqq")); // true
        System.out.println("pqpq: " + checker.pqBalanceString("pqpq")); // true
        System.out.println("ppq: " + checker.pqBalanceString("ppq")); // false
        System.out.println("qp: " + checker.pqBalanceString("qp")); // false
        System.out.println("p: " + checker.pqBalanceString("p")); // false
        System.out.println("q: " + checker.pqBalanceString("q")); // true (no 'p', so considered balanced)
        System.out.println("pqp: " + checker.pqBalanceString("pqp")); // false
        System.out.println("pqpqp: " + checker.pqBalanceString("pqpqp"));// false
        System.out.println(""": " + checker.pqBalanceString("")); // true (empty string)
        System.out.println("pqqq: " + checker.pqBalanceString("pqqq")); //true
        System.out.println("ppqqq: " + checker.pqBalanceString("ppqqq")); //false

    }
}
