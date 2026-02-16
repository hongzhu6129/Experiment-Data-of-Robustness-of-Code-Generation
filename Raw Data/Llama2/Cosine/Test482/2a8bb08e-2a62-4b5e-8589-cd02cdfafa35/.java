import java.util.*;
public class Main
{
public String removeAllZ(String stng) 
{
  String fin_str = "";
  int l = stng.length();
  for (int i = 0; i < l; i++)
  {
    char temp = stng.charAt(i);
    if (!(i > 0 && i < l - 1 && temp == 'z'))
      fin_str = fin_str + temp;
  }
    return fin_str;     
}

public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "zebrazone";
      System.out.println("The given string is: "+str1);
      System.out.println("The new string is: "+m.removeAllZ(str1));
	  }
}