   public static int modulusOptimized(int dividend, int divisor) { // Optimized
       if (divisor == 0) {
           throw new ArithmeticException("Divisor cannot be zero.");
       }
       // ... (handle negative numbers as before)

       int quotient = dividend / divisor;
       return dividend - (quotient * divisor);
   }
   