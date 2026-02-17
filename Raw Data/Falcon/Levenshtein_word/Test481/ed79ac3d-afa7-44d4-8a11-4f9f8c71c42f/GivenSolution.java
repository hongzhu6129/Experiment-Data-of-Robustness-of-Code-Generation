import java.util.*;
public class Main
{
public String pickMiddleOfBread(String stng) 
{
  int len = stng.length();
  String tmpString = "";
  String resultString = "";
  int st = 0;
  int en = 0;
  boolean found = false;
  if (len <= 10)
    return "";
  for (int i = 0; i < len - 4; i++) 
  {
    tmpString = stng.substring(i, i+5);
    if (tmpString.equals("toast") && found == true)
      en = i; 
    if (tmpString.equals("toast") && found == false) 
	{
      st = i+5;
      found = true;
    }
  }
  resultString = stng.substring(st,en);
  return resultString;
}
public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "sweettoastbuttertoast";
      System.out.println("The given strings is: "+str1);
      System.out.println("The new string is: "+m.pickMiddleOfBread(str1));
	  }
}