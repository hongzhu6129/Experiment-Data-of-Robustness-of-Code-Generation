import java.math.BigInteger;

public class FermatNumbersBigInteger {

    public static void main(String[] args) {
        int n = 10; // Number of Fermat numbers to display

        System.out.println("First " + n + " Fermat numbers (using BigInteger):");

        for (int i = 0; i < n; i++) {
            BigInteger two = BigInteger.valueOf(2);
            BigInteger exponent = two.pow(i);
            BigInteger fermatNumber = two.pow(exponent.intValueExact()).add(BigInteger.ONE); //intValueExact() to ensure fit in int
            System.out.println(fermatNumber);
        }
    }
}
