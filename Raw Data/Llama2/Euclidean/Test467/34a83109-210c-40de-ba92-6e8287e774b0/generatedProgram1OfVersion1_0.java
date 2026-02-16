import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SwapVariables {

    public static void swap(int[] variables) {
        if (variables == null || variables.length < 2) {
            return; // Or throw an exception, depending on desired behavior
        }

        variables[0] = variables[0] + variables[1];
        variables[1] = variables[0] - variables[1];
        variables[0] = variables[0] - variables[1];
    }


    public static void main(String[] args) {
        int[] values = {5, 10};
        System.out.println("Before swap: a = " + values[0] + ", b = " + values[1]);
        swap(values);
        System.out.println("After swap: a = " + values[0] + ", b = " + values[1]);


        values[0] = Integer.MAX_VALUE;
        values[1] = Integer.MIN_VALUE;
        System.out.println("Before swap: a = " + values[0] + ", b = " + values[1]);

        try {
             swap(values); // This will trigger arithmetic overflow with the current method.
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Overflow occurred.");
        }
         System.out.println("After attempted swap: a = " + values[0] + ", b = " + values[1]);



    }



    @Test
    void testSwap() {
        int[] values = {5, 10};
        swap(values);
        assertArrayEquals(new int[]{10, 5}, values);
    }

    @Test
    void testSwapZero() {
        int[] values = {0, 0};
        swap(values);
        assertArrayEquals(new int[]{0, 0}, values);
    }

    @Test
    void testSwapNegative() {
        int[] values = {-5, 10};
        swap(values);
        assertArrayEquals(new int[]{10, -5}, values);
    }
    @Test
    void testSwapNull() {
        int[] values = null;
        swap(values);
        assertNull(values); // or assert an exception if you choose to throw one
    }

    @Test
    void testSwapEmptyArray() {
        int[] values = new int[0];  // Empty Array
        swap(values);
        assertArrayEquals(new int[0], values);  // Should remain empty
    }

     @Test
    void testSwapOneElementArray(){
         int[] values = {5};
         swap(values);
         assertArrayEquals(new int[]{5}, values); // Should remain unchanged.
     }




}
