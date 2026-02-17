import java.util.*;
public class Main
{
public boolean isAndTheEquality(String stng) 
{
  int l = stng.length();
  int st_the = 0;
  int st_is = 0;
  for (int i = 0; i < l; i++) 
  {
    if (i < l - 2) 
	{
      String tmp = stng.substring(i,i+3);
      if (tmp.equals("the"))
        st_the++;
    }
    if (i < l - 1) 
	{
      String tmp2 = stng.substring(i,i+2);
      if (tmp2.equals("is"))
        st_is++;
    }
  }
  if (st_the == st_is)
    return true;
  else
    return false;
}

public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "Thisisthethesis";
      System.out.println("The given string is: "+str1);
      System.out.println("Are the appearance of 'the' and 'is' equal? "+m.isAndTheEquality(str1));
	  }
}