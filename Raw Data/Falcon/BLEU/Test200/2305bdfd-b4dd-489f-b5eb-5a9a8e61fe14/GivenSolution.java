import java.util.*;
public class Main
{
public String pickColor(String str) 
{
  if (str.startsWith("red"))
    return "red";
  if (str.startsWith("black"))
    return "black";
  else
    return "";
}
public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "blacksea";
      System.out.println("The given strings is: "+str1);
      System.out.println("The string begins with the color: "+m.pickColor(str1));
	  }
}