import java.math.BigInteger;
import java.util.Tuple;

class Solution {

    static BigInteger rev(BigInteger n) {
        String s = n.toString();
        StringBuilder sb = new StringBuilder(s);
        return new BigInteger(sb.reverse().toString());
    }

    static Tuple lychrel(BigInteger n) {
        BigInteger originalN = n;
        int iterations = 0;
        for (int i = 0; i < 500; i++) {
            n = n.add(rev(n));
            if (n.equals(rev(n))) {
                return new Tuple(false, iterations + 1, n); // Not a Lychrel candidate
            }
            iterations++;
        }

        return new Tuple(true, iterations, originalN); // Lychrel candidate
    }


    public static void main(String[] args) {
        int lychrelCount = 0;
        for (int i = 1; i <= 10000; i++) {
            Tuple result = lychrel(BigInteger.valueOf(i));
            if ((boolean) result.getItem1()) {
                lychrelCount++;
                System.out.println(i + " is a Lychrel candidate (after " + result.getItem2() + " iterations)");
            } 
        }
        System.out.println("Total Lychrel candidates: " + lychrelCount);
    }


    // Simple Tuple implementation for demonstration (replace with a proper Tuple library if available)
    static class Tuple {
        private final Object[] items;

        public Tuple(Object... items) {
            this.items = items;
        }

        public Object getItem1() {
            return items[0];
        }

        public Object getItem2() {
            return items[1];
        }

         public Object getItem3() {
            return items[2];
        }


    }
}
