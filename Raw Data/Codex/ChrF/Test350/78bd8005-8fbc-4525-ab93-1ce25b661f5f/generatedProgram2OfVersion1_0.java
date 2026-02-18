   public static double calculatePerimeter(double radius) {
       if (radius < 0) {
           throw new IllegalArgumentException("Radius cannot be negative.");
       }
       return 2 * Math.PI * radius;
   }
   // Similar handling in calculateArea()
   