public class StringComparison {

    public static void main(String[] args) {
        String str1 = "Hello"; // Sample string
        StringBuffer strBuf = new StringBuffer("Hello"); // Sample StringBuffer

        // Method 1: Convert StringBuffer to String and compare
        String str2 = strBuf.toString();
        if (str1.equals(str2)) {
            System.out.println("Strings are equal (using .toString() and .equals())");
        } else {
            System.out.println("Strings are NOT equal (using .toString() and .equals())");
        }


        // Method 2: Using contentEquals() (more efficient for StringBuffer comparison)
        if (str1.contentEquals(strBuf)) { // Directly compare String with StringBuffer
            System.out.println("Strings are equal (using .contentEquals())");
        } else {
            System.out.println("Strings are NOT equal (using .contentEquals())");
        }



        // Demonstrating a case where they are NOT equal:
        strBuf.append(" World!");

         if (str1.contentEquals(strBuf)) { 
            System.out.println("Strings are equal (using .contentEquals() after append)");
        } else {
            System.out.println("Strings are NOT equal (using .contentEquals() after append)");
        }

        if (str1.equals(strBuf.toString())) { 
            System.out.println("Strings are equal (using .toString() and equals() after append)");
        } else {
            System.out.println("Strings are NOT equal (using .toString() and equals() after append)");
        }

    }
}
