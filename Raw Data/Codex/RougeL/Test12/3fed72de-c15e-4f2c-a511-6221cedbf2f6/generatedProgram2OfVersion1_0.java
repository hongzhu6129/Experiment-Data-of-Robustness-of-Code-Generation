      public static void printFace(String eyes, String nose, String mouth) {
          System.out.println("  +\"\"\"\"+");
          System.out.println(" [| " + eyes + " |]");
          System.out.println("  |  " + nose + "  |");
          System.out.println("  | " + mouth + " |");
          System.out.println("  +-----+");
      }


      // In a separate testing class (using JUnit or TestNG)
      @Test
      public void testSadFace() {
          ByteArrayOutputStream outContent = new ByteArrayOutputStream();
          System.setOut(new PrintStream(outContent));

          PrintFace.printFace("x x", "-", "("); // Sad face

          String expectedOutput = "  +\"\"\"\"+ \n" +
                                  "[| x x |] \n" +
                                  "  |  -  | \n" +
                                  "  | ( | \n" +
                                  "  +-----+ \n";

          assertEquals(expectedOutput, outContent.toString());

          System.setOut(System.out); // Restore System.out
      }
      