import java.util.*;
public class Main
{
public boolean hasGood(String str) 
{
  if(str.length() < 4)
    return false;
  else if ((str.substring(0,4)).equals("good"))
    return true;
  else if (str.length() > 4)
  {
    if ((str.substring(1,5)).equals("good"))
      return true;
  }
    return false;
}
public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "goodboy";
	  
      System.out.println("The given strings is: "+str1);
      System.out.println("The 'good' appear in the string is: "+m.hasGood(str1));
	  }
}