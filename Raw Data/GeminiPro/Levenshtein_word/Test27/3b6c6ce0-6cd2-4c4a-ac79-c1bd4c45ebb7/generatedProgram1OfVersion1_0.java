import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberComparator {

    /**
     * Compares two numbers and returns an integer indicating their relationship.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return -1 if num1 is less than num2, 0 if they are equal, and 1 if num1 is greater than num2.
     */
    public int compare(double num1, double num2) {
        if (num1 < num2) {
            return -1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return 1;
        }
    }

    // Test cases using JUnit 5
    public static class NumberComparatorTest {

        @Test
        void testLessThan() {
            NumberComparator comparator = new NumberComparator();
            assertEquals(-1, comparator.compare(1, 2));
            assertEquals(-1, comparator.compare(-5, -2));
            assertEquals(-1, comparator.compare(1.5, 2.5));
        }

        @Test
        void testEqualTo() {
            NumberComparator comparator = new NumberComparator();
            assertEquals(0, comparator.compare(5, 5));
            assertEquals(0, comparator.compare(0, 0));
            assertEquals(0, comparator.compare(-3.14, -3.14));
            assertEquals(0, comparator.compare(Double.NaN, Double.NaN)); // NaN is considered equal to itself
        }

        @Test
        void testGreaterThan() {
            NumberComparator comparator = new NumberComparator();
            assertEquals(1, comparator.compare(10, 5));
            assertEquals(1, comparator.compare(-1, -5));
            assertEquals(1, comparator.compare(3.14, 1.57));
         }

        @Test
        void testPositiveInfinity() {
             NumberComparator comparator = new NumberComparator();
             assertEquals(-1, comparator.compare(10, Double.POSITIVE_INFINITY));
             assertEquals(1, comparator.compare(Double.POSITIVE_INFINITY, 10));
             assertEquals(0, comparator.compare(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY));
        }

        @Test
        void testNegativeInfinity() {
             NumberComparator comparator = new NumberComparator();
             assertEquals(1, comparator.compare(10, Double.NEGATIVE_INFINITY));
             assertEquals(-1, comparator.compare(Double.NEGATIVE_INFINITY, 10));
             assertEquals(0, comparator.compare(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY));
         }

        @Test
        void testInfinityAndNaN(){
             NumberComparator comparator = new NumberComparator();
             assertEquals(1, comparator.compare(Double.NaN, Double.NEGATIVE_INFINITY));
             assertEquals(1, comparator.compare(Double.NaN, Double.POSITIVE_INFINITY));
         }

         @Test
         void testMaxValueAndMinValue() {
             NumberComparator comparator = new NumberComparator();
             assertEquals(1, comparator.compare(Double.MAX_VALUE, Double.MIN_VALUE));
             assertEquals(-1, comparator.compare(Double.MIN_VALUE, Double.MAX_VALUE));

         }


    }


    public static void main(String[] args) {
       // You can run the tests using a testing framework like JUnit.  
    }
}
