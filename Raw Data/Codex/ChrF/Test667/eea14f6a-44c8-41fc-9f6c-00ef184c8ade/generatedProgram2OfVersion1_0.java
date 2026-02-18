import java.math.BigInteger;

public class FermatNumbersBigInteger {

    public static void main(String[] args) {
        System.out.println("First 10 Fermat Numbers:");

        for (int n = 0; n < 10; n++) {
            BigInteger fermatNumber = calculateFermatNumber(n);
            System.out.println(fermatNumber);
        }
    }

    private static BigInteger calculateFermatNumber(int n) {
        return BigInteger.valueOf(2).pow((int) Math.pow(2, n)).add(BigInteger.ONE);
    }
}
