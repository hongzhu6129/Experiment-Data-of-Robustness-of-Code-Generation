   import java.util.Scanner;

   public class FirstThreeChars {

       public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter a string: ");
           String str1 = scanner.nextLine();

           StringBuilder result = new StringBuilder();

           if (str1.length() >= 3) {
               result.append(str1.substring(0, 3));
           } else {
               result.append(str1);
               while (result.length() < 3) {
                   result.append("#");
               }
           }

           System.out.println("Result: " + result.toString()); // Convert to String
           scanner.close();
       }
   }
   