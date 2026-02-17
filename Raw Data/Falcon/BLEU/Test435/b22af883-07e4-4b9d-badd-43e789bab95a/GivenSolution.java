public class Main {
 public static void main(String[] args) {
   String text = "Check two consecutive identical letters in a given string";
   System.out.println("Original text: " + text);
   System.out.println("\nReverses the words in the string that have odd lengths:\n" + test(text));
   text = "Create a Date object using the Calendar class";
   System.out.println("\nOriginal text: " + text);
   System.out.println("\nReverses the words in the string that have odd lengths:\n" + test(text));
 }
 public static String test(String str) {
   String[] str_words = str.split(" ");
   for (int i = 0; i < str_words.length; i++) {
     if (str_words[i].length() % 2 != 0) {
       StringBuilder reverser = new StringBuilder(str_words[i]);
       str_words[i] = reverser.reverse().toString();
     }
   }
   return String.join(" ", str_words);
 }
}