public class StringEndsWith {

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "World";
        String str3 = "Java";

        // Using endsWith() method
        boolean endsWithStr2 = str1.endsWith(str2);
        boolean endsWithStr3 = str1.endsWith(str3);


        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + endsWithStr2);
        System.out.println("\"" + str1 + "\" ends with \"" + str3 + "\"? " + endsWithStr3);


        // Demonstrating edge cases (empty strings)
        String emptyString = "";
        String someString = "Test";

        System.out.println("\"" + someString + "\" ends with \"" + emptyString + "\"? " + someString.endsWith(emptyString)); // True - all strings end with an empty string
        System.out.println("\"" + emptyString + "\" ends with \"" + someString + "\"? " + emptyString.endsWith(someString));  //False

        //Demonstrating with null
        String nullString = null;

        try{
             System.out.println("\"" + str1 + "\" ends with \"" + nullString + "\"? " + str1.endsWith(nullString)); //Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Checking if a string ends with null throws a NullPointerException");
        }

         try{
             System.out.println("\"" + nullString + "\" ends with \"" + str2 + "\"? " + nullString.endsWith(str2)); //Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Checking if null ends with a string throws a NullPointerException");
        }


    }
}
