public class LastThreeChars {

    public static void main(String[] args) {
        String str = "programming"; // Example string - You can change this

        if (str.length() >= 3) {
            String lastThree = str.substring(str.length() - 3);
            String modifiedStr = lastThree + str + lastThree;
            System.out.println(modifiedStr); 
        } else {
            System.out.println("String length must be three or more.");
        }



        str = "abcdef"; // Example string 2
        if (str.length() >= 3) {
            String lastThree = str.substring(str.length() - 3);
            String modifiedStr = lastThree + str + lastThree;
            System.out.println(modifiedStr);
        } else {
            System.out.println("String length must be three or more.");
        }


        str = "ab"; // Example string too short
         if (str.length() >= 3) {
            String lastThree = str.substring(str.length() - 3);
            String modifiedStr = lastThree + str + lastThree;
            System.out.println(modifiedStr);
        } else {
            System.out.println("String length must be three or more.");
        }
    }
}
