import java.util.*;
public class Main
{
public boolean popInTheString(String stng) 
{
  int len = stng.length();
  for (int i = 0; i < len - 2; i++) 
  {
    if (stng.charAt(i) == 'p' && stng.charAt(i+2) == 'p')
    return true;
  }
  return false;
}
public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "dikchapop";
      System.out.println("The given string is: "+str1);
      System.out.println("Is p?p appear in the given string? "+m.popInTheString(str1));
	  }
}