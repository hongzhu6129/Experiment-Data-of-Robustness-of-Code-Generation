   import java.util.HashSet;
   import java.util.Set;

   public class UniquenessTest {
       public static void main(String[] args) {
           Set<String> generatedNumbers = new HashSet<>();
           for (int i = 0; i < 1000; i++) { // Run a large number of times
               StringBuilder fiveDigitNumber = new StringBuilder();
               Set<Integer> digits = new HashSet<>(); // Reset for each number generation

               while (fiveDigitNumber.length() < 5) {
                   int digit = (int) (Math.random() * 4) + 1; 
                   if (!digits.contains(digit)) {
                       digits.add(digit);
                       fiveDigitNumber.append(digit);
                   }
               }
               generatedNumbers.add(fiveDigitNumber.toString());
           }
           System.out.println("Number of unique numbers generated: " + generatedNumbers.size()); 
       }
   }
   