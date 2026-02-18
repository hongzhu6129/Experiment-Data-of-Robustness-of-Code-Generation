import java.util.*;
public class Main
{
public String endsWithMirrorImage(String stng) 
{
  int l  = stng.length();
  String f_str = "";
  String t_str1 = "";
  String t_str2  = "";
  for (int i = 0; i < l; i++) 
  {
    t_str1 += stng.substring(i,i+1);
    t_str2 = "";
    for (int j = t_str1.length()-1; j >= 0; j--) 
	{
      t_str2 += t_str1.substring(j,j+1);
      if (t_str2.equals(stng.substring(l-i-1,l)))
        f_str = t_str1;
    }
  }
  return f_str;
}
public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "rotavator";
      System.out.println("The given string is: "+str1);
      System.out.println("The longest mirror image string in the string is: "+m.endsWithMirrorImage(str1));
	  }
}