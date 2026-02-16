import java.util.*;
public class Main
{
public String beginningRepetition(String stng, int n) 
{
  int l = stng.length();
  String newstring = "";
  for (int i = n; n > 0; n--)
  {
    newstring += stng.substring(0,n);
  }
  return newstring;
}

public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "welcome";
	  int rep_no=4;
      System.out.println("The given string is: "+str1);
	  System.out.println("Number of repetition characters and repetition: "+rep_no);
      System.out.println("The new string is: "+m.beginningRepetition(str1,rep_no));
	  }
}