public static int calculateModulusEfficient(int dividend, int divisor) {
     // ... (Handle zero divisor and negative numbers as before) ...

     int quotient = dividend / divisor;
     return dividend - (quotient * divisor);
}
