import java.util.*;
public class Main
{
public boolean aCharacterIsHappy(String stng) 
{
  int l = stng.length();
  boolean char_happy = true;
  for (int i = 0; i < l; i++) 
  {
    if (stng.charAt(i) == 'z') 
	{
      if (i > 0 && stng.charAt(i-1) == 'z')
        char_happy = true;
      else if (i < l-1 && stng.charAt(i+1) == 'z')
        char_happy = true;
      else
        char_happy = false;
    }
  }
  return char_happy;
}
public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "azzlea";
      System.out.println("The given string is: "+str1);
      System.out.println("Is Z happy in the string: "+m.aCharacterIsHappy(str1));
	  }
}