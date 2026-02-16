import java.util.Scanner;
 public class Main {
   public static void main(String[] args) {
     Scanner myObj = new Scanner(System.in);
     System.out.println("Input the first string: ");
     String text = myObj.nextLine();
     System.out.println("Input the second string: ");
     String word = myObj.nextLine();
     System.out.println("Check first string contains letters from the second string:\n" + test(text, word));
   }
   public static boolean test(String first_string, String second_string) {
     if (second_string.length() > first_string.length()) return false;
     if (second_string.isEmpty())
       return true;
     for (int i = 0; i < second_string.length(); i++) {
       if (!first_string.contains(String.valueOf(second_string.charAt(i))))
         return false;
     }
     return true;
   }
 }