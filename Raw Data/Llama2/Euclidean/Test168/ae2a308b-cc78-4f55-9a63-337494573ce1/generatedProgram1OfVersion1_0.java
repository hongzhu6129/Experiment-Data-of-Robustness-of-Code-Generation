public class LastThreeChars {

    public static void main(String[] args) {
        String str = "programming"; // Example string

        if (str.length() > 3) {
            String lastThree = str.substring(str.length() - 3);
            String modifiedStr = lastThree + str + lastThree;
            System.out.println(modifiedStr); // Output: ingprogramminging
        
            str = "Python";  // Another example
            lastThree = str.substring(str.length() - 3);
            modifiedStr = lastThree + str + lastThree;
            System.out.println(modifiedStr); // Output: honPythonhon

            str = "ab"; // String with length less than 3
             if (str.length() > 3) {
                lastThree = str.substring(str.length() - 3);
                modifiedStr = lastThree + str + lastThree;
                System.out.println(modifiedStr);
             } else {
                 System.out.println("String length must be greater than 3."); // Handling the case where length is less than or equal to 3
             }

        }  else {
                 System.out.println("String length must be greater than 3."); // Handling the case where length is less than or equal to 3
        }



    }
}
