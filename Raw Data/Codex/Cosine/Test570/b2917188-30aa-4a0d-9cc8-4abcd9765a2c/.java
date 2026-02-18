import java.util.*;
public class Main
{
public boolean anyStringAtEnd(String stng1, String stng2) 
{
  stng1 = stng1.toLowerCase();
  int aLen = stng1.length();
  stng2 = stng2.toLowerCase();
  int bLen = stng2.length();
  if (aLen < bLen) 
  {
    String temp = stng2.substring(bLen - aLen, bLen);
    if (temp.compareTo(stng1) == 0)
      return true;
    else
      return false;
  } else 
  {
    String temp = stng1.substring(aLen - bLen, aLen);
    if (temp.compareTo(stng2) == 0)
      return true;
    else
      return false;
  }
}
public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "pqrxyz";
	  String str2= "xyz";
      System.out.println("The given strings are: "+str1+"  and "+str2);
      System.out.println("Is one string appears at the end of other? "+m.anyStringAtEnd(str1,str2));
	  }
}