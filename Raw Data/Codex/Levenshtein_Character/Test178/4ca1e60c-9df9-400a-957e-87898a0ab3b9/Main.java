import java.util.*;
public class Main 
{
public String conCat(String st1, String st2) 
{
        if (st1.length() != 0 && st2.length() != 0
                && st1.charAt(st1.length() - 1) == st2.charAt(0))
            return st1 + st2.substring(1);
        return st1 + st2;
}

    public static void main (String[] args)
    {
      Main m= new Main();
      String str1 =  "food";
      String str2 = "door";
      System.out.println("The given strings are: "+str1+"  and  "+str2);
      System.out.println("The string after concatination are: "+m.conCat(str1,str2));
    }
}