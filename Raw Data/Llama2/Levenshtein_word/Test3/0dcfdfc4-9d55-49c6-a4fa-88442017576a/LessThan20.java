import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LessThan20 {

    public static boolean isLessThan20(int a, int b, int c) {
        int diffAB = Math.abs(a - b);
        int diffAC = Math.abs(a - c);
        int diffBC = Math.abs(b - c);

        return (Math.min(Math.min(diffAB, diffAC), diffBC) <= 20); 
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(isLessThan20(1, 21, 3)); // True
        System.out.println(isLessThan20(20, 40, 60)); // False
        System.out.println(isLessThan20(10, 11, 12)); //True
        System.out.println(isLessThan20(1, 2, 23));//true.



    }


    @Test
    void testLessThan20() {
        assertTrue(isLessThan20(1, 21, 3)); // Difference of 20
        assertFalse(isLessThan20(20, 40, 60)); // All differences greater than 20
        assertTrue(isLessThan20(10, 11, 12)); // Small differences
        assertTrue(isLessThan20(1, 2, 23)); // One difference is much larger, but another is small
        assertTrue(isLessThan20(0,0,0)); //zero case

        // Corner cases with negative numbers:
        assertTrue(isLessThan20(-10, 10, 5)); // Difference of 20
        assertFalse(isLessThan20(-30, -50, -70));
        assertTrue(isLessThan20(-5,-6,-7));



        // Corner cases involving Integer.MAX_VALUE and Integer.MIN_VALUE: Be very careful with overflow!
        assertFalse(isLessThan20(Integer.MAX_VALUE, Integer.MIN_VALUE, 0)); // This will likely overflow if you subtract directly!


        // Test cases around the boundary of 20
        assertFalse(isLessThan20(1,22,3));
        assertTrue(isLessThan20(1,21,3));



    }

}



