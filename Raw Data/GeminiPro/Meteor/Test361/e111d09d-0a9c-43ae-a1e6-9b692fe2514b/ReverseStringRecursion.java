public class ReverseStringRecursion {

    void reverseString(String str) {
        if ((str == null) || (str.length() <= 1)) {
            System.out.print(str);
        } else {
            System.out.print(str.charAt(str.length() - 1));
            reverseString(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        ReverseStringRecursion obj = new ReverseStringRecursion();
        String str = "example"; 
        System.out.print("Reversed string of \"" + str + "\" is: \"");
        obj.reverseString(str);
        System.out.println("\"");


        str = "hello";
        System.out.print("Reversed string of \"" + str + "\" is: \"");
        obj.reverseString(str);
        System.out.println("\"");

        // Test with null and empty string
        System.out.print("Reversed string of null is: \"");
        obj.reverseString(null);
        System.out.println("\"");

        System.out.print("Reversed string of \"\" is: \"");
        obj.reverseString("");
        System.out.println("\"");


    }
}
