import java.util.*; 
class Main
{
    static boolean checkForRotation (String str1, String str2)
    {
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
    }
    public static void main (String[] args)
    {
        String str1 = "ABACD";
        String str2 = "CDABA";
		    System.out.println("The given strings are: "+str1+"  and  "+str2);
		    System.out.println("\nThe concatination of 1st string twice is: "+str1+str1);

        if (checkForRotation(str1, str2))
        {
		        System.out.println("The 2nd string "+str2+"  exists in the new string.");	
            System.out.println("\nStrings are rotations of each other");
        }
        else
        {
          	System.out.println("The 2nd string "+str2+"  not exists in the new string.");	
            System.out.printf("\nStrings are not rotations of each other");
        }
    }
}