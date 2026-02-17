public class StringSplitter {

    static void splitString(String str, int n) {
        if (str == null || str.isEmpty()) {
            System.out.println("Input string is empty or null.");
            return;
        }

        int str_size = str.length();

        // Check if string can be divided into n equal parts
        if (str_size % n != 0) {
            System.out.println("String cannot be divided into " + n + " equal parts.");
            return;
        }


        int part_size = str_size / n;  // Calculate the size of each part

        for (int i = 0; i < str_size; i += part_size) {
            System.out.println(str.substring(i, i + part_size));
        }
    }



    public static void main(String[] args) {

        String str = "abcdefghijklmnopqrstuvwx"; // Example string
        int n = 4; // Number of parts

        System.out.println("Splitting the string \"" + str + "\" into " + n + " equal parts:");
        splitString(str, n);


        System.out.println("\nAnother Example:");
        String str2 = "HelloWorld";
        int n2 = 2;
        splitString(str2,n2);

        System.out.println("\nExample with non-divisible length:"); // Example demonstrating non-divisible length
        String str3 = "JavaCode";
        int n3 = 3;
        splitString(str3, n3);


         System.out.println("\nExample with an empty string:"); // Example demonstrating empty input
        String str4 = "";
        int n4 = 2;
        splitString(str4, n4);
        

    }
}



