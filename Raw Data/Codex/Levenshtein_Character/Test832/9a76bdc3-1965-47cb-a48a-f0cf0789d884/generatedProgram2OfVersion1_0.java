   import java.math.BigInteger;

   public class FermatNumbers {

       public static void main(String[] args) {
           System.out.println("First 10 Fermat Numbers:");

           for (int n = 0; n < 10; n++) {
               BigInteger two = BigInteger.valueOf(2);
               BigInteger exponent = two.pow(n);  // 2^n
               BigInteger fermatNumber = two.pow(exponent.intValueExact()).add(BigInteger.ONE);

               System.out.println(fermatNumber);
           }
       }
   }
   