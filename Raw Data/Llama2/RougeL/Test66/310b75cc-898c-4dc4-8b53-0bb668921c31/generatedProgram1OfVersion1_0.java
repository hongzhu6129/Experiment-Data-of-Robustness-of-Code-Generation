public class StringToNumeric {

    public static void main(String[] args) {
        String str = "12345";

        try {
            int intValue = Integer.parseInt(str);
            System.out.println("Integer value: " + intValue);

            long longValue = Long.parseLong(str);
            System.out.println("Long value: " + longValue);

            float floatValue = Float.parseFloat(str);
            System.out.println("Float value: " + floatValue);


            double doubleValue = Double.parseDouble(str);
            System.out.println("Double value: " + doubleValue);



        } catch (NumberFormatException e) {
            System.out.println("Invalid string format for conversion to numeric types.");
        }


        String strWithDecimal = "12345.67";

                try {

                    float floatValue2 = Float.parseFloat(strWithDecimal);
                    System.out.println("Float value (with decimal) : " + floatValue2);


                    double doubleValue2 = Double.parseDouble(strWithDecimal);
                    System.out.println("Double value (with decimal): " + doubleValue2);

                } catch (NumberFormatException e) {
                    System.out.println("Invalid string format for conversion to float or double.");
        }

    }
}
