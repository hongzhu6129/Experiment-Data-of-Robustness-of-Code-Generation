import java.util.*;
public class Main
{
public String withoutMacth(String str) 
{
  int len = str.length();
  if (len == 2)
    return "";
  if (len < 2)
    return str;
  else 
  {
    if (str.substring(0,2).equals(str.substring(len-2, len)))
      return str.substring(2,len);
      else return str;
  }
}

public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "educated";
	  
      System.out.println("The given strings is: "+str1);
      System.out.println("The new string is: "+m.withoutMacth(str1));
	  }
}