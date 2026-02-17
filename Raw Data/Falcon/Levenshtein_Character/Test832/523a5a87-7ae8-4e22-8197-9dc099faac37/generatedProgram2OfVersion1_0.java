import java.math.BigInteger;

public class FermatNumbers {

    public static void main(String[] args) {
        System.out.println("First 10 Fermat Numbers:");

        for (int n = 0; n < 10; n++) {
            BigInteger fermatNumber = calculateFermatNumber(n);
            System.out.println(fermatNumber);
        }
    }


    private static BigInteger calculateFermatNumber(int n) {
        BigInteger two = BigInteger.valueOf(2);
        return two.pow((int) Math.pow(2, n)).add(BigInteger.ONE); // Use BigInteger.pow
    }
}
