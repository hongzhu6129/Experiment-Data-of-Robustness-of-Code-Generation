public class PQBalance {

    public boolean pqBalanceString(String str) {
        if (str == null || str.isEmpty()) {
            return true; // Empty string is considered balanced
        }

        boolean seenP = false;
        for (char c : str.toCharArray()) {
            if (c == 'p') {
                seenP = true;
            } else if (c == 'q') {
                if (!seenP) {
                    return false; // 'q' before 'p'
                }
                seenP = false; // Reset for the next 'p'
            }
        }

        return !seenP; // True if no 'p' is left without a following 'q'
    }

    public static void main(String[] args) {
        PQBalance checker = new PQBalance();

        System.out.println("pqq : " + checker.pqBalanceString("pqq"));       // True
        System.out.println("pqqq : " + checker.pqBalanceString("pqqq"));     // False
        System.out.println("ppqq : " + checker.pqBalanceString("ppqq"));     // True
        System.out.println("pqpq : " + checker.pqBalanceString("pqpq"));     // True
        System.out.println("qp : " + checker.pqBalanceString("qp"));       // False
        System.out.println("pq : " + checker.pqBalanceString("pq"));       // True
        System.out.println("p : " + checker.pqBalanceString("p"));         // False
        System.out.println("q : " + checker.pqBalanceString("q"));         // False
        System.out.println("empty string: " + checker.pqBalanceString("")); // True
        System.out.println("prq : " + checker.pqBalanceString("prq"));     // False (other characters are ignored, so it's like "pq") � Clarified in explanation
        System.out.println("pqr : " + checker.pqBalanceString("pqr"));      // False (other characters don't affect balance directly)


    }
}
