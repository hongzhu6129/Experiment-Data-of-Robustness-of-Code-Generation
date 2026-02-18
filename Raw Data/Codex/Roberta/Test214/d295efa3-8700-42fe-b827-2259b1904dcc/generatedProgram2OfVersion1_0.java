import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(15, ArithmeticOperations.add(10, 5)); // Example for add - create similar tests for other operations
        // ... Add more assertions for subtract, multiply, divide, remainder
    }


    @Test
    void testDivisionByZero(){
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(10, 0));
    }


    // ... Add more test methods for other test cases


    //Helper methods to isolate operation for testing
      static double add(double num1, double num2){
        return num1 + num2;
    }

    static double subtract(double num1, double num2){
        return num1 - num2;
    }

    static double multiply(double num1, double num2){
        return num1 * num2;
    }

    static double divide(double num1, double num2){
          if(num2 == 0) {
              throw new ArithmeticException("Division by Zero");
          }
          return num1/num2;
    }

    static double remainder(double num1, double num2){
          if(num2 == 0) {
              throw new ArithmeticException("Division by Zero");
          }
        return num1%num2;
    }


}
