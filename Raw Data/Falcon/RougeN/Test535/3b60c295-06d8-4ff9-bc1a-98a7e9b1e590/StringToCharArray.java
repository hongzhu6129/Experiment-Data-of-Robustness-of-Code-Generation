public class StringToCharArray {

    public static void main(String[] args) {
        String str = "sample";

        // Method 1: Using toCharArray() method
        char[] charArray1 = str.toCharArray();

        System.out.print("Character array using toCharArray(): ");
        for (char c : charArray1) {
            System.out.print(c + " ");
        }
        System.out.println();


        // Method 2:  Manually creating and populating the array
        char[] charArray2 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray2[i] = str.charAt(i);
        }

        System.out.print("Character array using manual population: ");
        for (char c : charArray2) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
