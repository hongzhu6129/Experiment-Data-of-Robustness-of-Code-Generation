public class StringConversions {

    public static void main(String[] args) {
        String str = "12345";
        String strFloat = "123.45";
        String strDouble = "67890.12345";


        try {
            int i = Integer.parseInt(str);
            System.out.println("Integer: " + i);

            long l = Long.parseLong(str);
            System.out.println("Long: " + l);
            
            float f = Float.parseFloat(strFloat);
            System.out.println("Float: " + f);

            double d = Double.parseDouble(strDouble);
            System.out.println("Double: " + d);


        } catch (NumberFormatException e) {
            System.out.println("Invalid string format for conversion.");
        }
    }
}
