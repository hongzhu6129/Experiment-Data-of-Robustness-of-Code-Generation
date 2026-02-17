import java.util.*;
public class Main
{
boolean appearTwice(String stng) 
{
  int i = stng.indexOf("z");
  if (i == -1) return false; 
  if (i+1 >= stng.length()) return false; 
  return stng.substring(i+1, i+2).equals("z");
}

public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "fizzez";
      System.out.println("The given string is: "+str1);
      System.out.println("Is 'z' appear twice respectively? "+m.appearTwice(str1));
	  }
}