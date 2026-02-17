   public static void main(String[] args) {
       if (args.length == 3) { // Check if 3 arguments were provided
           double num1 = Double.parseDouble(args[0]);
           double num2 = Double.parseDouble(args[1]);
           double num3 = Double.parseDouble(args[2]);

           // ... rest of the code (calculate and print average)
       } else {
           System.out.println("Please provide three numbers as command-line arguments.");
       }
   }
   