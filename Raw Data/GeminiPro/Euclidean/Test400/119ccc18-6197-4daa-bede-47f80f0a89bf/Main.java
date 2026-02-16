import java.util.*;
public class Main
{
public String stringMixing(String stng1, String stng2) 
{
  int len1 = stng1.length();
  int len2 = stng2.length();
  int max_len = Math.max(len1, len2);
  String newstring = "";
  for (int i = 0; i < max_len; i++) 
  {
    if (i <= len1-1)
      newstring += stng1.substring(i,i+1);
    if (i <= len2-1)
      newstring += stng2.substring(i,i+1);
  }
  return newstring;
}

public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "welcome";
      String str2 =  "w3resource";	  
      System.out.println("The given strings  are: "+str1+"  and  "+str2);
      System.out.println("The new string is: "+m.stringMixing(str1,str2));
	  }
}