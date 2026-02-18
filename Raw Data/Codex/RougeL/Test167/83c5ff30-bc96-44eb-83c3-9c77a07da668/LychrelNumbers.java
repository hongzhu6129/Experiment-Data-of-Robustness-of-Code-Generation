import java.math.BigInteger;
import java.util.Tuple; // Assuming you have a Tuple class defined

public class LychrelNumbers {

    static BigInteger rev(BigInteger n) {
        String s = n.toString();
        StringBuilder sb = new StringBuilder(s);
        return new BigInteger(sb.reverse().toString());
    }

    static Tuple lychrel(BigInteger n) {
        BigInteger original = n;
        int iterations = 0;
        for (int i = 0; i < 500; i++) {
            n = n.add(rev(n));
            if (n.equals(rev(n))) {
                return new Tuple<>(false, iterations + 1, n); // Not a Lychrel candidate
            }
            iterations++;
        }
        return new Tuple<>(true, iterations, n); // Lychrel candidate
    }

    public static void main(String[] args) {
        int lychrelCount = 0;

        for (int i = 1; i <= 10000; i++) {
            Tuple result = lychrel(BigInteger.valueOf(i));
            if ((Boolean) result.getItem1()) {
                lychrelCount++;
                System.out.println("Lychrel candidate: " + i + " (iterations: " + result.getItem2() + ", final value: " + result.getItem3() + ")");
            }
        }

        System.out.println("Total Lychrel candidates found: " + lychrelCount);
    }
}


// Simple Tuple implementation (replace with a real Tuple class if available)
class Tuple {
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

    public Object getItem3() { return items[2]; }

    // Add getters for more items if needed
}
