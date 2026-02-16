import java.util.*;
public class Main
{
public boolean nChrStringSomewhere (String stng, int n_chr) 
{
  int len = stng.length();
  String pre_str = stng.substring(0,n_chr);
  for (int i = n_chr; i < len; i++) 
  {
    if(n_chr+i <= len) 
	{
      if (pre_str.equals(stng.substring(i,n_chr+i)))
        return true;
    }
  }
  return false;
}
public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "MrsJemsMrsam";
      int n=3;
	  String prechr=str1.substring(0,n);
      System.out.println("The given string is: "+str1);
      System.out.println("The prefix string length is: "+n);
      System.out.println("Is '"+ prechr+"' appear else where in the string? "+m.nChrStringSomewhere(str1,n));
	  }
}