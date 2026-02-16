import java.util.*;
public class Main
{
public String pairsToReturn(String stng) 
{
  String fin_str = "";
  for (int i=0; i<stng.length(); i += 5) 
  {
    int end = i + 3;
    if (end > stng.length()) 
	{
      end = stng.length();
    }
    fin_str = fin_str + stng.substring(i, end);
  }
  return fin_str;
}

public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "w3resource.com";
      System.out.println("The given string is: "+str1);
      System.out.println("The new string is: "+m.pairsToReturn(str1));
	  }
}