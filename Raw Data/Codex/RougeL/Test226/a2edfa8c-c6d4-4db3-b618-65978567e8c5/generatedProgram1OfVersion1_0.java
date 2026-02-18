public class FictionalArrayString {

    public static void main(String[] args) {
        // Create a string representation of a fictional array.
        String fictionalArray = "[ 'apple', 123, true, 3.14, { 'name': 'John' } ]";

        // Print the fictional array string.
        System.out.println(fictionalArray);


        // Alternatively, construct it more programmatically (though still a string)
        StringBuilder sb = new StringBuilder("[");
        sb.append(" 'apple', ");
        sb.append(123).append(", ");
        sb.append(true).append(", ");
        sb.append(3.14).append(", ");
        sb.append("{ 'name': 'John' }");  // Note: this nested structure is still just a string
        sb.append(" ]");

        System.out.println(sb.toString());


        //  If you actually wanted an array (not just a string depicting one), you'd use an Object array:
        Object[] realArray = new Object[5];
        realArray[0] = "apple";
        realArray[1] = 123;
        realArray[2] = true;
        realArray[3] = 3.14;
        realArray[4] = "{ 'name': 'John' }";  //  This is a string representation of a JSON-like object



        System.out.print("[ ");
        for(int i=0; i < realArray.length; i++){
            System.out.print(realArray[i]);
            if (i < realArray.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println(" ]");

    }
}
