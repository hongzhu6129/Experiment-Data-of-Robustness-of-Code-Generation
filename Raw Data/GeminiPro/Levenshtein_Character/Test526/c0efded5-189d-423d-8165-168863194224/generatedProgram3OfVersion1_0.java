import java.math.BigInteger;

public class FermatNumbersBigInteger {

    public static void main(String[] args) {
        System.out.println("The first 10 Fermat numbers are:");

        for (int n = 0; n < 10; n++) {
            BigInteger powerOfTwo = BigInteger.valueOf(2).pow(1 << n); 
            BigInteger fermatNumber = powerOfTwo.add(BigInteger.ONE);
            System.out.println("F" + n + ": " + fermatNumber);
        }
    }
}
