import java.util.*;
public class Main
{
public String addBySeparator(String main_str, String sep_str, int ctr) 
{
  String new_word = "";
  for (int i = 0; i < ctr; i++) 
  {
    if (i < ctr-1)
      new_word += main_str + sep_str;
    else
      new_word += main_str;
  }
  return new_word;
}
public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "try";
      String str2 =  "best";
	  int ctr=3;
	  
      System.out.println("The given strings are: "+str1+"  and  "+str2);
	  System.out.println("Number to times to be repeat: "+ctr);
      System.out.println("The new string is: "+m.addBySeparator(str1,str2,ctr));
	  }
}