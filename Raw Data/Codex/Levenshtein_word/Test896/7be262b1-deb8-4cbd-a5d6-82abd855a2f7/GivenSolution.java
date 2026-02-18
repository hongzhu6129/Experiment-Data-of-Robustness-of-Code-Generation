import java.util.Scanner;   
 public class Main {
   public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);   
    System.out.println("Input a string: ");
    String text = myObj.nextLine();
    System.out.println("Input a word to remove: ");
    String word = myObj.nextLine();
    System.out.println("New string, after removing the said word:\n"+test(text,word));
  }
  
 public static String test(String text, String word) 
  	{
		String result_str = text.replace(word, "");
		result_str = result_str.replaceAll("\\s+", " ");
		return result_str;
  }  
}