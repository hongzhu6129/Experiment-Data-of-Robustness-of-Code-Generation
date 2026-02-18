public class test {
 
   public static void main(String[] args) {	   
	    String text = "Java";
		System.out.println("Original String: "+text);
		System.out.println("Move all lower case letters to the front of the said word: "+validate(text));
		text = "JavaScript";
		System.out.println("\nOriginal String: "+text);
		System.out.println("Move all lower case letters to the front of the said word: "+validate(text));
		text = "SQLite";
		System.out.println("\nOriginal String: "+text);
		System.out.println("Move all lower case letters to the front of the said word: "+validate(text));		
	}

   public static String validate(String text) {
        return text.replaceAll("[A-Z]", "") + text.replaceAll("[a-z]", "");
   }
}