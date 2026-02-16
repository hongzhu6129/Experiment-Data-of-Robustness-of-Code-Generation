import java.util.*;
public class Main
{
public boolean abcInMiddle(String stng) 
{
  String abc = "abc";
  int l = stng.length();
  int mid_pos = l / 2;
  if (l < 3)
    return false;
  if (l % 2 != 0) 
  {
    if (abc.equals(stng.substring(mid_pos-1,mid_pos+2))) 
	{
      return true;
    } else 
	{
        return false;
      }
  } 
  else if (abc.equals(stng.substring(mid_pos-1,mid_pos+2)) || abc.equals(stng.substring(mid_pos-2,mid_pos+1))) 
	  {
          return true;
  } 
  else
      return false; 
}
public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "xxabcxxx";
      System.out.println("The given string is: "+str1);
      System.out.println("Is abc appear in middle? "+m.abcInMiddle(str1));
	  }
}