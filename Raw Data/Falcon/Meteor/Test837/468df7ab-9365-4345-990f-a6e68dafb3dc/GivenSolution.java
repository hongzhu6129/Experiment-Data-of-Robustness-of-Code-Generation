import java.util.*;
public class Main
{
public String removeString(String m_string, String r_string) 
{
  int m_st_len = m_string.length();
  int r_st_len = r_string.length();
  String m_lower  = m_string.toLowerCase();
  String r_lower  = r_string.toLowerCase();
  String f_string = "";
  for (int i = 0; i < m_st_len; i++) 
  {
    if (i <= m_st_len - r_st_len) 
	{
      String tmp = m_lower.substring(i,i+r_st_len);
      if (!tmp.equals(r_lower))
        f_string += m_string.substring(i,i+1);
      else 
	  {
        i += r_st_len-1;
      }
    }
    else 
	{
      String tmp2 = m_lower.substring(i,i+1);
      if (!tmp2.equals(r_lower))
        f_string += m_string.substring(i,i+1);
    }
  }
  return f_string;
}

public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "This is the test string";
	  String str2= "st";
      System.out.println("The main string is: "+str1);
      System.out.println("The removable string is: "+str2);
      System.out.println("The new string is: "+m.removeString(str1,str2));
	  }
}