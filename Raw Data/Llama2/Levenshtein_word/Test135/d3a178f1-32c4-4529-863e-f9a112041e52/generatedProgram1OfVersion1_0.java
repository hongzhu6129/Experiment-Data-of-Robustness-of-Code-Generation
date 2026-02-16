public class LeapYearChecker {

    public static void main(String[] args) {
        int year = 2024; // You can change this to test different years

        if (year % 4 != 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println(year + " is a leap year.");
        }


        //Alternative more concise approach within main:
        year = 2000; // Test another year

         boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

         if(isLeap) {
             System.out.println(year + " is a leap year.");
         } else {
            System.out.println(year + " is not a leap year.");
         }

         //Getting year input from command line arguments:
         if (args.length > 0) {
             try {
                year = Integer.parseInt(args[0]); 
                isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                System.out.println(year + (isLeap ? " is a leap year." : " is not a leap year."));
             } catch (NumberFormatException e) {
                 System.err.println("Invalid input. Please provide a valid year as a command-line argument.");
             }
         }


    }
}
