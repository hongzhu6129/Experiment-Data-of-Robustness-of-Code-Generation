   public class CubeCheckerEfficient {

       public static void main(String[] args) {
           double number = 8;

           double cubeRoot = Math.cbrt(number);  // Use cbrt() for cube root

           if (cubeRoot == Math.round(cubeRoot)) {  // Check if it's an integer
               System.out.println("Number is a cube.");
           } else {
               System.out.println("Number is not a cube.");
           }
       }
   }
   