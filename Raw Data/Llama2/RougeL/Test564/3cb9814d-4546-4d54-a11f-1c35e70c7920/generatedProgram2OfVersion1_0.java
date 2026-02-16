   private static long calculateFermatNumber(int n) {
       return (1L << (1 << n)) + 1;  // Optimized with bitwise left-shift
   }
   