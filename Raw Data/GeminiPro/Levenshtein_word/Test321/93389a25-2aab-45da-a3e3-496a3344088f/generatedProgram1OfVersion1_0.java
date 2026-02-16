public class GetCharacterBeforeIndex {

    public static void main(String[] args) {
        String str = "Hello World";
        int index = 5;

        if (index > 0 && index <= str.length()) {
            int codePoint = str.codePointBefore(index);
            System.out.println("Character before index " + index + ": " + (char) codePoint);
        } else {
            System.out.println("Invalid index.");
        }



        str = "Hello World";
        index = 1 ;


        if (index > 0 && index <= str.length()) {
            int codePoint = str.codePointBefore(index);
            System.out.println("Character before index " + index + ": " + (char) codePoint);
        } else {
            System.out.println("Invalid index.");
        }


        str = "Hello";
        index = 0;

        if (index > 0 && index <= str.length()) {
            int codePoint = str.codePointBefore(index);
            System.out.println("Character before index " + index + ": " + (char) codePoint);
        } else {
            System.out.println("Invalid index.");
        }


           str = "Java";
        index = 4;


        if (index > 0 && index <= str.length()) {
            int codePoint = str.codePointBefore(index);
            System.out.println("Character before index " + index + ": " + (char) codePoint);
        } else {
            System.out.println("Invalid index.");
        }

    }
}
