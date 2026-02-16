   public static String getCurrentDateTime(String format) {
       try {
           // ... (Existing code)
       } catch (DateTimeParseException e) {
           System.err.println("Invalid date/time format: " + e.getMessage());
           return "Invalid Format"; // Or handle it as needed
       }
   }
   