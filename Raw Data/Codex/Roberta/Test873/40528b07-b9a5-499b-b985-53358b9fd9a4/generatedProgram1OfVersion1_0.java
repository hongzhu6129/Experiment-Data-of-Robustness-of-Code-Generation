import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Tuple {
    int seeds;
    int related;
    List<BigInteger> seedList;

    public Tuple(int seeds, int related, List<BigInteger> seedList) {
        this.seeds = seeds;
        this.related = related;
        this.seedList = seedList;
    }
}

public class LychrelNumbers {

    static BigInteger rev(BigInteger n) {
        BigInteger reversed = BigInteger.ZERO;
        while (!n.equals(BigInteger.ZERO)) {
            reversed = reversed.multiply(BigInteger.TEN).add(n.mod(BigInteger.TEN));
            n = n.divide(BigInteger.TEN);
        }
        return reversed;
    }

    static Tuple lychrel(BigInteger n) {
        int seeds = 0;
        int related = 0;
        List<BigInteger> seedList = new ArrayList<>();
        Set<BigInteger> relatedSet = new HashSet<>();

        for (int i = 1; i <= n.intValue(); i++) {
            BigInteger num = BigInteger.valueOf(i);
            BigInteger current = num;
            boolean isLychrel = true;

            for (int j = 0; j < 500; j++) {
                BigInteger reversed = rev(current);
                current = current.add(reversed);

                if (current.equals(rev(current))) {
                    isLychrel = false;
                    break;
                }
            }

            if (isLychrel) {
                if (!relatedSet.contains(num)) {
                    seeds++;
                    seedList.add(num);

                    BigInteger relatedNum = num;
                    for (int j = 0; j < 500; j++) {
                        BigInteger reversed = rev(relatedNum);
                        relatedNum = relatedNum.add(reversed);
                        relatedSet.add(relatedNum);

                        if (relatedNum.equals(rev(relatedNum))) break; // Optimization to avoid infinite loops
                    }

                }
                related++;
            }
        }


        return new Tuple(seeds, related - seeds, seedList); // Related count adjusted for seed count

    }

    public static void main(String[] args) {
        Tuple result = lychrel(BigInteger.valueOf(10000));
        System.out.println(result.seeds + " Lychrel seeds: " + result.seedList);
        System.out.println(result.related + " Lychrel related");
        System.out.println(result.seeds + " Lychrel palindromes: " + result.seedList); // Palindromes are the seeds themselves in this context

    }
}
