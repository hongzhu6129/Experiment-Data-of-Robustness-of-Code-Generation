public class test { 
   public static void main(String[] args) {	   
	    String text = "Follow";
		System.out.println("Original word: "+text);
		System.out.println("If there are two consecutive identical letters in the said string: "+ test(text));
		text = "Java";
		System.out.println("Original word: "+text);
		System.out.println("If there are two consecutive identical letters in the said string: "+ test(text));
		text = "Yellow";
		System.out.println("Original word: "+text);
		System.out.println("If there are two consecutive identical letters in the said string: "+ test(text));
        }

   public static boolean test(String text) {
			for (int i=0;i<text.length()-1;i++)
			if (text.charAt(i)==text.charAt(i+1))
				return true;
		return false;
  }
}