import java.util.*;
public class Main
{
public String kitKatPattern(String stng) 
{
  int len = stng.length();
  String newformstring = "";
  for (int i = 0; i < len; i++) 
  {
    newformstring += stng.substring(i,i+1);
    if (i > 0 && i < len-1) 
	{
      if (stng.charAt(i-1) == 'z' && stng.charAt(i+1) == 'g')
        newformstring = newformstring.substring(0,newformstring.length()-1);
    }
  }
  return newformstring;
}
public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "zzgkitandkatcaketoket";
      System.out.println("The given string is: "+str1);
      System.out.println("The new string is: "+m.kitKatPattern(str1));
	  }
}