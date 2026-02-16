import java.util.*;
public class Main
{
public String makeWithEvenCharacters(String stng) 
{
  int len = stng.length();
  String fin_str = "";
  for (int i = 0; i < len; i = i + 2) 
  {
    fin_str += stng.charAt(i);
  }
  return fin_str;
}
public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "w3resource.com";
      System.out.println("The given string is: "+str1);
      System.out.println("The new string is: "+m.makeWithEvenCharacters(str1));
	  }
}