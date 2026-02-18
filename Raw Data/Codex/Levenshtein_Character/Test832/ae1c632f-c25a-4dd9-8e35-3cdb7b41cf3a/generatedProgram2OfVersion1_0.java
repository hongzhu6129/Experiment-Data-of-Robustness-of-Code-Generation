import java.math.BigInteger;

public class FermatNumbersBigInteger {

    public static void main(String[] args) {
        System.out.println("First 10 Fermat Numbers (using BigInteger):");

        for (int n = 0; n < 10; n++) {
            BigInteger two = BigInteger.valueOf(2);
            BigInteger powerOfTwo = two.pow((int) Math.pow(2, n));  // 2^(2^n)
            BigInteger fermatNumber = powerOfTwo.add(BigInteger.ONE);

            System.out.println(fermatNumber);
        }
    }
}
