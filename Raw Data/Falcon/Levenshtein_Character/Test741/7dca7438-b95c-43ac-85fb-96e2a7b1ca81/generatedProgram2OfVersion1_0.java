   Scanner scanner = new Scanner(System.in);
   System.out.print("Input a number: ");
   if (scanner.hasNextInt()) {
       num = scanner.nextInt();
   } else {
       System.out.println("Invalid input. Please enter an integer.");
       return;
   }
   