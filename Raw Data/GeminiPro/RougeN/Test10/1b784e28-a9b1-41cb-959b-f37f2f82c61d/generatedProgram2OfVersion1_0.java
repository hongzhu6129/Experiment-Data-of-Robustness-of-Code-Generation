   public static void printFace(String emotion) {
       String mouth = "";
       switch (emotion) {
           case "happy": mouth = " |  ^  |"; break;
           case "sad": mouth = " |  _  |"; break;
           default: mouth = " | '-' |";
       }
       System.out.println("  +\"\"\"\"+");
       System.out.println(" [| o o |]");
       System.out.println(mouth); // Using the emotion-based mouth
       System.out.println("  +-----+");
   }

   public static void main(String[] args) {
       printFace("happy");
       printFace("sad");
       printFace("neutral"); // Default case
   }
   