public class LastIndexOfString {

    public static void main(String[] args) {
        String str = "This is a test string. This is a string.";
        String subStr = "string";

        int lastIndex = str.lastIndexOf(subStr);

        System.out.println("Last index of '" + subStr + "' is: " + lastIndex);


        // Demonstration with a substring that doesn't exist:
        String notFoundSubStr = "xyz";
        int notFoundIndex = str.lastIndexOf(notFoundSubStr);
        System.out.println("Last index of '" + notFoundSubStr + "' is: " + notFoundIndex); // Output: -1


        //Demonstrating empty string search:
        String emptyString = "";
        int emptyStringIndex = str.lastIndexOf(emptyString);
        System.out.println("Last index of '" + emptyString + "' is: " + emptyStringIndex); // Output: string length



         // Demonstrating with null string
        // Note: Handle null carefully to prevent NullPointerExceptions
         String nullString = null;
         String testString = "hello";
       try{
           int nullIndex = testString.lastIndexOf(nullString); //Throws NullPointerException 
           System.out.println("Last index of '" + nullString + "' is: " + nullIndex); 
       }catch(NullPointerException e){
           System.out.println("Searching for a null substring throws NullPointerException!");
       }
    }
}
