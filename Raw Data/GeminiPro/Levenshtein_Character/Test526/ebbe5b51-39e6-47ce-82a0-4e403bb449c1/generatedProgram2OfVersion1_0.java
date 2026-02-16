import java.math.BigInteger;

public class FermatNumbersBig {

    public static void main(String[] args) {
        System.out.println("The first 10 Fermat numbers are:");

        for (int n = 0; n < 10; n++) {
            BigInteger fermatNumber = calculateFermatNumber(n);
            System.out.println("F(" + n + ") = " + fermatNumber);
        }
    }

    private static BigInteger calculateFermatNumber(int n) {
        return BigInteger.valueOf(2).pow((int) Math.pow(2, n)).add(BigInteger.ONE); 
    }
}
