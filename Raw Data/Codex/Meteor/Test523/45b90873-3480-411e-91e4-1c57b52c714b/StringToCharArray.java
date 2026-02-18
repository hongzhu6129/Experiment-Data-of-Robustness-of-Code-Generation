public class StringToCharArray {

    public static void main(String[] args) {
        String str = "sample"; // The string to convert

        char[] charArray = str.toCharArray();

        System.out.print("Character array: [");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
            if (i < charArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");


    }
}
