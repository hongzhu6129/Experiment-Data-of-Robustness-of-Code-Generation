   public static String function(int decimal) {
       return Long.toHexString(decimal & 0xFFFFFFFFL).toUpperCase(); // Handle negative as unsigned
   }
   