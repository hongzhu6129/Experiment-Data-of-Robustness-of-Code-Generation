   public static String validate(String input) {
       StringBuilder sb = new StringBuilder();
       for (char c : input.toCharArray()) {
           if (Character.isLetterOrDigit(c)) {
               sb.append(c);
           }
       }
       return sb.toString();
   }
   