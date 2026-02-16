import java.util.*;

public class test {
 
   public static void main(String[] args) {
	   
	    String text = "python";
		System.out.println("Original string: "+text);
		System.out.println("New string: "+validate(text));
		text = "JavaScript";
		System.out.println("\nOriginal string: "+text);
		System.out.println("New string: "+validate(text));
		text = "PYTHON";
		System.out.println("\nOriginal string: "+text);
		System.out.println("New string: "+validate(text));
        }

   public static String validate(String text) {
	   	String str = text.toLowerCase();
		if (str.contains("python")) {
			return "Java";
		} 
		return "C++";
   }
}