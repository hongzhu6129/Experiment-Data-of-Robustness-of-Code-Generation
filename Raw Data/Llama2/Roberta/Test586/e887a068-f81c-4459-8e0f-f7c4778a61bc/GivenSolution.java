import java.util.*;
public class Main
{
public String lastNchrRepeat(String stng, int no_repeat) 
{
  int l = stng.length();
  String new_word = "";
  for (int i = 0; i < no_repeat; i++) 
  {
    new_word += stng.substring(l - no_repeat, l);
  }
  return new_word;
}
public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "string";
      int no_char=3;
      System.out.println("The given string is: "+str1);
      System.out.println("The new string after repetition: "+m.lastNchrRepeat(str1,no_char));
	  }
}