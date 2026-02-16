   public class CircleCalculations {
       public static void main(String[] args) {
           double[] testRadii = {7.5, 10, 1, 0, 0.0001, -5}; // Add your test cases here

           for (double radius : testRadii) {
               double perimeter = 2 * Math.PI * Math.abs(radius);  // Handle negative gracefully
               double area = Math.PI * Math.abs(radius) * Math.abs(radius); // Handle negative gracefully

               System.out.printf("Radius: %.4f, Perimeter: %.2f, Area: %.2f\n", radius, perimeter, area);


                // Add your assertion logic here if desired (e.g., compare with expected values)
           }
       }
   }
   